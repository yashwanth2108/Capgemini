package com.example.question_6.Model;

public class Calculator {
    private Double number = 0.0;

    public Calculator(Double number) {
        this.number = number;
    }
    public Calculator()
    {

    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return ""+number;
    }
}
