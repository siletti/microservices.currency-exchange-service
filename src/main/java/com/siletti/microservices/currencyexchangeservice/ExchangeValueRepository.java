package com.siletti.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository  extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByToAndFrom(String to, String from);

}



