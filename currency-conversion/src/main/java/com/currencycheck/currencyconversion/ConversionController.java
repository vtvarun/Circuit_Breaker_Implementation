package com.currencycheck.currencyconversion;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ConversionController {


    @Autowired
    CurrencyExchangeProxy currencyExchangeProxy;

    @GetMapping("/get-converted-amount/from/{from}/to/{to}/amount/{amount}")
    @CircuitBreaker(name = "currency-exchange", fallbackMethod = "showingDefault")
    public CurrencyConversion getConversion(@PathVariable String from, @PathVariable String to,
                              @PathVariable Double amount){

        log.info("Trying to call currency-exchange API");

        CurrencyConversion currencyConversion = currencyExchangeProxy.getRates(from,to);
        currencyConversion.setRequestedAmount(amount);
        currencyConversion.setConvertedAmount(amount * currencyConversion.getExchangeRate());

        return currencyConversion;
    }

    public CurrencyConversion showingDefault(Exception ex){
        return new CurrencyConversion("US","IND",111.1,"13",1.4,1.6);
    }
}
