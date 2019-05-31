package com.example.demo.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Proposal;
import com.example.demo.model.RuleResponse;

@Service
public class ProposalCalculatorService {
	Logger logger = LoggerFactory.getLogger(ProposalCalculatorService.class);

	@Autowired
    private KieContainer kieContainer;
	
	public RuleResponse validate(Proposal request) {
		RuleResponse response  = new RuleResponse();
		if(request != null) {
	        KieSession kieSession = kieContainer.newKieSession();
	        kieSession.insert(request);
	        kieSession.insert(response);
	        int ruleFiredCount = kieSession.fireAllRules();
	        kieSession.destroy();
	        logger.info("Trigged " + ruleFiredCount + " Rules.");
		}

        return response;
    }
}
