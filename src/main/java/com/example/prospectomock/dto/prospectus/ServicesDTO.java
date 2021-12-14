package com.example.prospectomock.dto.prospectus;



public class ServicesDTO {
    private ProductDTO product;

    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ServicesDTO{" +
                "product=" + product +
                '}';
    }
}
