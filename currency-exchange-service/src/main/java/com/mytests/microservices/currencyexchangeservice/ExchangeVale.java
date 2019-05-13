package com.mytests.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeVale {

	public ExchangeVale(String from, String to, String id, BigDecimal conversionMultiple) {
		super();
		this.from = from;
		this.to = to;
		this.id = id;
		this.conversionMultiple = conversionMultiple;
	}

	@Column(name = "currency_from")
	private String from;

	@Column(name = "currency_to")
	private String to;

	@Id
	private String id;

	private BigDecimal conversionMultiple;

	//@Column(nullable =true)
	private int port;

	public void setFrom(String from) {
		this.from = from;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public String getId() {
		return id;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public ExchangeVale() {

	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
