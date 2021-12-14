package com.example.prospectomock.dto.prospectus;

import com.example.prospectomock.dto.generic.ProspectusCommonDTO;

import java.util.List;

public class ProspectusDTO extends ProspectusCommonDTO {
    private static final long serialVersionUID = 1L;
    private List<ServicesDTO> services;
    private BankDTO bank;
    private List<AccountsDTO> accounts;
    private String personType;
    private List<BusinessDocumentsDTO> businessDocuments;

    public List<ServicesDTO> getServices() {
        return services;
    }

    public void setServices(List<ServicesDTO> services) {
        this.services = services;
    }

    public BankDTO getBank() {
        return bank;
    }

    public void setBank(BankDTO bank) {
        this.bank = bank;
    }

    public List<AccountsDTO> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountsDTO> accounts) {
        this.accounts = accounts;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public List<BusinessDocumentsDTO> getBusinessDocuments() {
        return businessDocuments;
    }

    public void setBusinessDocuments(List<BusinessDocumentsDTO> businessDocuments) {
        this.businessDocuments = businessDocuments;
    }

    @Override
    public String toString() {
        return "{" +
            " services='" + getServices() + "'" +
            ", bank='" + getBank() + "'" +
            ", accounts='" + getAccounts() + "'" +
            ", personType='" + getPersonType() + "'" +
            ", businessDocuments='" + getBusinessDocuments() + "'" +
            "}";
    }

}
