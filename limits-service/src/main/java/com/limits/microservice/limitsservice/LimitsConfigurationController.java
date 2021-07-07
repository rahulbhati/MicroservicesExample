package com.limits.microservice.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
	
	 @Autowired
	 private Configuration configuration;
	
	@GetMapping("/limits")
	public LimiConfiguration retrievLimiConfigurations() {
		return new LimiConfiguration(configuration.getMaximum(),configuration.getMinimum());
		
	}

}
