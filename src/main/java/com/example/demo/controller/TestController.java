package com.example.demo.controller;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Address;
import com.example.demo.model.fact.AddressCheckResult;

import javax.annotation.Resource;


@RequestMapping("/test")
@Controller
public class TestController {
	Logger logger = LoggerFactory.getLogger(TestController.class);
    @Resource
    private KieContainer kieContainer;

    @ResponseBody
    @RequestMapping("/address")
    public void test(String country, int num){
        Address address = new Address();
        address.setCountry(country);
        address.setPostcode(generateRandom(num));
        KieSession kieSession = kieContainer.newKieSession();
        logger.info("postal code = " + address.getPostcode());
        
        AddressCheckResult result = new AddressCheckResult();
        kieSession.insert(address);
        kieSession.insert(result);
        int ruleFiredCount = kieSession.fireAllRules();
        kieSession.destroy();
        System.out.println("触发了" + ruleFiredCount + "条规则");

        if(result.isPostCodeResult()){
            System.out.println("规则校验通过");
        }

    }

    /**
     * 生成随机数
     * @param num
     * @return
     */
    public String generateRandom(int num) {
        String chars = "0123456789";
        StringBuffer number=new StringBuffer();
        for (int i = 0; i < num; i++) {
            int rand = (int) (Math.random() * 10);
            number=number.append(chars.charAt(rand));
        }
        return number.toString();
    }
}
