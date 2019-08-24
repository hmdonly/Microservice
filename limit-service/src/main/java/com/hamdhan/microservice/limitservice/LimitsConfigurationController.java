package com.hamdhan.microservice.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamdhan.microservice.limitservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private LimitConfiguration limitConfiguration;
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(limitConfiguration.getMinimum(),limitConfiguration.getMaximum());
		
	}

}
