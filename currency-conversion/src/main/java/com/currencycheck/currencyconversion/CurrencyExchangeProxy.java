package com.currencycheck.currencyconversion;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeProxy {

    @GetMapping("/currency-exchange/get-exchange-rates/from/{from}/to/{to}")
    public CurrencyConversion getRates(@PathVariable String from, @PathVariable String to);
}
