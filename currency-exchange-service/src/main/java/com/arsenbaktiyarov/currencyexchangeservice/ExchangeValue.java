package com.arsenbaktiyarov.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	
	@Id
	private Long id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	private BigDecimal conversationMultiple;
	private int port;
	
	public ExchangeValue() {}
	
	public ExchangeValue(Long id, String from, String to, BigDecimal conversationMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversationMultiple = conversationMultiple;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversationMultiple() {
		return conversationMultiple;
	}

	public void setConversationMultiple(BigDecimal conversationMultiple) {
		this.conversationMultiple = conversationMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
	
	
}
