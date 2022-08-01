package com.example.demo.controller;

import com.example.demo.model.RuleResponse;
import com.example.demo.model.User;
import com.example.demo.service.FinService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/fin")
@RestController
@Api(tags = "Proposal validation rule services", description = "Proposal validation MS")
public class FinController {
	private static final Logger logger = LoggerFactory.getLogger(FinController.class);

    @Autowired
    private FinService finService;
    
    /**
     * Validate the input proposal with the predefined product rule
     * @param user
     * @return
     */
    @ApiOperation("Policy Validation MS")
	@RequestMapping(value="/v1/campaign/validate", method=RequestMethod.POST)
    public RuleResponse registration(@RequestBody User user) {
		RuleResponse response  = new RuleResponse();
		if(user != null) {
            finService.validate(user);
		}

        return response;
    }
}
