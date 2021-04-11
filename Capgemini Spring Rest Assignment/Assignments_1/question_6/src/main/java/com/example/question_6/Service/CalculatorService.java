package com.example.question_6.Service;

import com.example.question_6.Model.Calculator;

public interface CalculatorService {
    Calculator number = new Calculator(0.0);
    public Calculator addNumbers(String firstNumber , String secondNumber);
    public Calculator substractNumbers(String firstNumber, String secondNumber);
    public Calculator multiplyNumbers(String firstNumber, String secondNumber);
    public Calculator divideNumbers(String firstNumber, String secondNumber);
}
