package com.example.prospectomock.dto.prospectus;


public class CurrenciesDTO {
   private static final long serialVersionUID = 1L;
   private String currency;
   private Boolean isMajor;

   public Boolean isIsMajor() {
      return this.isMajor;
   }

   public Boolean getIsMajor() {
      return this.isMajor;
   }

   public void setIsMajor(Boolean isMajor) {
      this.isMajor = isMajor;
   }

   public String getCurrency() {
      return currency;
   }

   public void setCurrency(String currency) {
      this.currency = currency;
   }

  
   @Override
   public String toString() {
      return "CurrenciesDTO{" +
              "currency='" + currency + '\'' +
              ", isMajor='" + isMajor + '\'' +
              '}';
   }
}
