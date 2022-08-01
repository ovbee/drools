package com.example.demo.service;

import com.example.demo.model.RuleResponse;
import com.example.demo.model.User;
import com.example.demo.model.fact.NewFundFact;
import com.example.demo.model.fact.KieFact;
import com.example.demo.model.fin.PromoCampaign;
import com.example.demo.model.fin.enums.Cur;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class FinService {
	Logger logger = LoggerFactory.getLogger(FinService.class);

	@Autowired
	private KieContainer kieContainer;

	public RuleResponse validate(User user) {
		RuleResponse response  = new RuleResponse();
		if(user != null) {
	        KieSession kieSession = kieContainer.newKieSession();
			PromoCampaign promoCampaign = this.generatePromoCampaign();
			this.injectUserFacts(user);

			kieSession.insert(promoCampaign);
	        kieSession.insert(user);
	        int ruleFiredCount = kieSession.fireAllRules();
	        kieSession.destroy();
	        logger.info("======Triggered [" + ruleFiredCount + "] Rules.======");
		}

        return response;
    }
	private void injectUserFacts(User user){
		//NewFund Fact
		NewFundFact newFundFact = new NewFundFact();
		newFundFact.setAmount(user.getNewFund());
		newFundFact.setCur(user.getNewFundCur());
		user.addUserFact(newFundFact);

		//MCSSA Fact

	}
	private PromoCampaign generatePromoCampaign(){
		PromoCampaign promoCampaign = new PromoCampaign();
		promoCampaign.setCampaignCode(this.genRandomString(10));

		List<KieFact> factList = new ArrayList<>();
		NewFundFact newFundFact = new NewFundFact();
		newFundFact.setAmount(BigDecimal.valueOf(10000.00));
		newFundFact.setCur(Cur.HKD);
		factList.add(newFundFact);

		promoCampaign.setFactList(factList);
		return promoCampaign;
	}
	private String genRandomString(int length){
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		Random random = new Random();
		return random.ints(leftLimit, rightLimit + 1)
				.limit(length)
				.map(c->Character.toUpperCase(c))
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
	}
}
