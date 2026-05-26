package com.bajaj.main.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class BfhlRequest {

    @JsonProperty("data")
    private List<String> data;

    // Getter & Setter
    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}