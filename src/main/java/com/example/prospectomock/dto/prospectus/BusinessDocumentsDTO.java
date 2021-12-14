package com.example.prospectomock.dto.prospectus;

public class BusinessDocumentsDTO {
    private static final long serialVersionUID = 1L;
    private String documentNumber;
    private BusinessDocumentTypeDTO businessDocumentType;

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public BusinessDocumentTypeDTO getBusinessDocumentType() {
        return businessDocumentType;
    }

    public void setBusinessDocumentType(BusinessDocumentTypeDTO businessDocumentType) {
        this.businessDocumentType = businessDocumentType;
    }

    @Override
    public String toString() {
        return "BusinessDocumentsDTO{" +
                "documentNumber='" + documentNumber + '\'' +
                ", businessDocumentType=" + businessDocumentType +
                '}';
    }
}
