package com.example.demo;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

	
	
	/*
	 * @Test public void adressRulePostcode() { // Given Address address = new
	 * Address(); address.setPostcode("99425"); address.setCountry("HKG");
	 * 
	 * 
	 * // When // Let´s give the Drools Knowledge-Base an Object, we can then apply
	 * rules on //kieSession.insert(address); AddressCheckResult result = new
	 * AddressCheckResult(); kieSession.insert(address); kieSession.insert(result);
	 * int ruleFiredCount = kieSession.fireAllRules();
	 * 
	 * // Then
	 * assertEquals("there´s 2 rule, thats meets the condition, so there should be 2 applied"
	 * , 2, ruleFiredCount); logger.info("Rules checked: {}" + ruleFiredCount); }
	 */
}
