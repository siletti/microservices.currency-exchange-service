package com.siletti.microservices.currencyexchangeservice;

import java.math.BigDecimal;

public class ExchangeValue {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversion;
    private int port;

    public ExchangeValue() {
    }

    public ExchangeValue(Long id, String from, String to, BigDecimal conversion) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversion = conversion;
    }

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getConversion() {
        return conversion;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
