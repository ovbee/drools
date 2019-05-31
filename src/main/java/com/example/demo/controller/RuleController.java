package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Proposal;
import com.example.demo.model.RuleResponse;
import com.example.demo.service.ProposalCalculatorService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/rule")
@RestController
@Api(tags = "Proposal validation rule services", description = "Proposal validation MS")
public class RuleController {
	Logger logger = LoggerFactory.getLogger(RuleController.class);

    @Autowired
    ProposalCalculatorService proposalCalculatorService;
    
    /**
     * Validate the input proposal with the predefined product rule
     * @param request
     * @return
     */
    @ApiOperation("Policy Validation MS")
	@RequestMapping(value="/v1/validate", method=RequestMethod.POST)
    public RuleResponse validate(@RequestBody Proposal request) {
		RuleResponse response  = new RuleResponse();
		if(request != null) {
	       response = proposalCalculatorService.validate(request);
		}

        return response;
    }
}
