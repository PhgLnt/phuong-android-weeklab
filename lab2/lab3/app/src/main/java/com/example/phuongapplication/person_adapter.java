package com.example.phuongapplication;

public class person_adapter {
    public person_adapter(String name, String from, int picNumber) {
        this.name = name;
        this.from = from;
        this.picNumber = picNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public int getPicNumber() {
        return picNumber;
    }

    public void setPicNumber(int picNumber) {
        this.picNumber = picNumber;
    }

    String name;
    String from;
    int picNumber;

}

