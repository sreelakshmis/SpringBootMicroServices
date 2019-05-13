package com.mytests.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	@Autowired
	Environment environment;

	@Autowired
	ExchangeValeRepository exchangeValeRepository;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeVale retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

		System.out.println("Sreelakshmi from:"+from+" to "+to);
		ExchangeVale exchangeValue = exchangeValeRepository.findByToAndFrom(to, from);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;
	}

}
