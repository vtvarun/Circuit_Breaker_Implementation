package com.currencycheck.currencyconversion;

public class CurrencyConversion {

    private String countryFrom;

    private String countryTo;

    private Double exchangeRate;

    private String portNumber;

    private Double requestedAmount;

    private Double convertedAmount;

    public CurrencyConversion(String countryFrom, String countryTo, Double exchangeRate, String portNumber, Double requestedAmount, Double convertedAmount) {
        this.countryFrom = countryFrom;
        this.countryTo = countryTo;
        this.exchangeRate = exchangeRate;
        this.portNumber = portNumber;
        this.requestedAmount = requestedAmount;
        this.convertedAmount = convertedAmount;
    }

    public String getCountryFrom() {
        return countryFrom;
    }

    public void setCountryFrom(String countryFrom) {
        this.countryFrom = countryFrom;
    }

    public String getCountryTo() {
        return countryTo;
    }

    public void setCountryTo(String countryTo) {
        this.countryTo = countryTo;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(String portNumber) {
        this.portNumber = portNumber;
    }

    public Double getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(Double requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public Double getConvertedAmount() {
        return convertedAmount;
    }

    public void setConvertedAmount(Double convertedAmount) {
        this.convertedAmount = convertedAmount;
    }
}
