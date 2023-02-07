package com.rh.example.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public class Dao1 {

    String value;

    public Dao1(String s) {
        value = s;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}