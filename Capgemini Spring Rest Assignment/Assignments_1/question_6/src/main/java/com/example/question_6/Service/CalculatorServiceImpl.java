package com.example.question_6.Service;

import org.springframework.stereotype.Service;
import com.example.question_6.Model.Calculator;

import javax.naming.Name;

@Service
public class CalculatorServiceImpl implements CalculatorService{


    Calculator first = null , second = null;
    @Override
    public Calculator addNumbers(String firstNumber, String secondNumber) {

        first = new Calculator(Double.parseDouble(firstNumber));
        second = new Calculator(Double.parseDouble(secondNumber));
        first.setNumber(first.getNumber()+second.getNumber());
        return first;
    }

    @Override
    public Calculator substractNumbers(String firstNumber, String secondNumber) {
        first = new Calculator(Double.parseDouble(firstNumber));
        second = new Calculator(Double.parseDouble(secondNumber));
        first.setNumber(first.getNumber()+second.getNumber());
        return first;
    }

    @Override
    public Calculator multiplyNumbers(String firstNumber, String secondNumber) {
        first = new Calculator(Double.parseDouble(firstNumber));
        second = new Calculator(Double.parseDouble(secondNumber));
        first.setNumber(first.getNumber()+second.getNumber());
        return first;
    }

    @Override
    public Calculator divideNumbers(String firstNumber, String secondNumber) {
        first = new Calculator(Double.parseDouble(firstNumber));
        second = new Calculator(Double.parseDouble(secondNumber));
        first.setNumber(first.getNumber()+second.getNumber());
        return first;
    }
}
