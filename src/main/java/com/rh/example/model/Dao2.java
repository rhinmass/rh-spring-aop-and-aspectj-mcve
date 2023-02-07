package com.rh.example.model;

import org.springframework.stereotype.Repository;

public class Dao2 {

    String value;

    public Dao2(String s) {
        value = s;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}