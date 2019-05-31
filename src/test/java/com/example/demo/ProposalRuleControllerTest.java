package com.example.demo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.model.ErrorMessage;
import com.example.demo.model.Proposal;
import com.example.demo.model.RuleResponse;

public class ProposalRuleControllerTest extends AbstractTest {
	Logger logger = LoggerFactory.getLogger(ProposalRuleControllerTest.class);

	@Override
	@Before
	public void setUp() {
		super.setUp();
	}

	@Test
	public void getProductsList() throws Exception {
		String uri = "/rule/v1/validate";
		Proposal proposal = new Proposal();
		proposal.setCurrency("CNY");
		proposal.setSumInsured(200000);
	      String inputJson = super.mapToJson(proposal);
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
	         .contentType(MediaType.APPLICATION_JSON_VALUE)
	         .content(inputJson)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      logger.info("===status===" + status);
	      
	      
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      logger.info("===content===" + content);
	      RuleResponse response = super.mapFromJson(content, RuleResponse.class);
	      List<ErrorMessage> errors = response.getErrors();
	      assertEquals(response.getStatus(), 0);
	      assertEquals(errors.size(), 2);
	}
}
