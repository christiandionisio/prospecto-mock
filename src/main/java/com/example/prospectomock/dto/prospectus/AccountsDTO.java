package com.example.prospectomock.dto.prospectus;

import java.util.List;

public class AccountsDTO {
    private static final long serialVersionUID = 1L;
    private String number;
    private NumberTypeDTO numberType;
    private List<CurrenciesDTO> currencies;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public NumberTypeDTO getNumberType() {
        return numberType;
    }

    public void setNumberType(NumberTypeDTO numberType) {
        this.numberType = numberType;
    }

    public List<CurrenciesDTO> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<CurrenciesDTO> currencies) {
        this.currencies = currencies;
    }

    @Override
    public String toString() {
        return "AccountsDTO{" +
                "number='" + number + '\'' +
                ", numberType=" + numberType +
                ", currencies=" + currencies +
                '}';
    }
}
