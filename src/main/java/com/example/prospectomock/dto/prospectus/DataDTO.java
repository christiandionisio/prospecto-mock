package com.example.prospectomock.dto.prospectus;

public class DataDTO {
    private static final long serialVersionUID = 1L;
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "DataDTO{" +
                "token='" + token + '\'' +
                '}';
    }
}
