package com.arsenbaktiyarov.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	
	@Value("${server.port}")
	private int port;
	

	@GetMapping("/currncy-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeValue = new ExchangeValue(1L, from, to, BigDecimal.valueOf(95));	
		exchangeValue.setPort(port);
		return exchangeValue;
	}	
	
}
