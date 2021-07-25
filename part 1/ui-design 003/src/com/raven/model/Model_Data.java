package com.raven.model;

public class Model_Data {

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Model_Data(boolean status, String text) {
        this.status = status;
        this.text = text;
    }

    public Model_Data() {
    }

    private boolean status;
    private String text;
}
