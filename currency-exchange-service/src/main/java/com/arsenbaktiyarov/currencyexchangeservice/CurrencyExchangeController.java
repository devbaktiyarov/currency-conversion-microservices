package com.arsenbaktiyarov.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@Value("${server.port}")
	private int port;
	
	private ExchangeValueRepository exchangeRepository;
	
	public CurrencyExchangeController(ExchangeValueRepository exchangeRepository) {
		super();
		this.exchangeRepository = exchangeRepository;
	}

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeValue = exchangeRepository.findByFromAndTo(from, to);	
		if(exchangeValue == null) {
			throw new RuntimeException(String.format("Value not found for %s to %s", from, to));
		}
		exchangeValue.setPort(port);
		return exchangeValue;
	}	
	
}
