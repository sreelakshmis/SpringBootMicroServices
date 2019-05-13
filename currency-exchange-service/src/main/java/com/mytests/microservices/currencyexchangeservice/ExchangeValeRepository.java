package com.mytests.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeValeRepository extends JpaRepository<ExchangeVale, Long> {

	ExchangeVale findByToAndFrom(String to, String from);

}
