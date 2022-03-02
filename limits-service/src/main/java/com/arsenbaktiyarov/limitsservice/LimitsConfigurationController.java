package com.arsenbaktiyarov.limitsservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
	
	@Value("${limits-service.minimum}")
	private String minimum;
	
	@Value("${limits-service.maximum}")
	private String maximum;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(Integer.parseInt(minimum), Integer.parseInt(maximum));
	}

}
