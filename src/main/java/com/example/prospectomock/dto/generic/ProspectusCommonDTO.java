package com.example.prospectomock.dto.generic;

public class ProspectusCommonDTO {
    private static final long serialVersionUID = 1L;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProspectusCommonDTO{" +
                "id='" + id + '\'' +
                '}';
    }
}
