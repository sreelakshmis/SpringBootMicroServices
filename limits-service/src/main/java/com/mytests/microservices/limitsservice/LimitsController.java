package com.mytests.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
	
	@Autowired
	private LimitsConfiguration limitsConfiguration;
	
	@GetMapping("/limits")
	public LimitConfiguration getLimitsConfiguration() {
		
		return new LimitConfiguration(limitsConfiguration.getMaximum(),limitsConfiguration.getMinimum());
	}

}
