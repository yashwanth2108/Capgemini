package com.example.question_6.Controller;


import com.example.question_6.Model.Calculator;
import com.example.question_6.Service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/Calculator")
public class CalculatorController {

    Calculator calculator = new Calculator(0.0);

    @Autowired
    CalculatorService calculatorService;


    @GetMapping(path = "/addNumberToPreviousNumber/{secondNumber}")
    public Calculator addCalculators(@PathVariable String secondNumber) {

        RestTemplate restTemplate = new RestTemplate();
        Calculator firstNumber = restTemplate.getForObject("http://localhost:8080/Calculator/getResult",Calculator.class);

        return calculatorService.addNumbers(firstNumber.getNumber().toString(),secondNumber);
    }
    @GetMapping(path = "/addNumberToPreviousNumber/{secondNumber}")

    public Calculator substractCalculators(@PathVariable String secondNumber) {

        RestTemplate restTemplate = new RestTemplate();
        Calculator firstNumber = restTemplate.getForObject("http://localhost:8080/Calculator/getResult",Calculator.class);

        return calculatorService.substractNumbers(firstNumber.getNumber().toString(),secondNumber);
    }

    @GetMapping(path = "/addNumberToPreviousNumber/{secondNumber}")
    public Calculator multiplyCalculators(@PathVariable String secondNumber) {

        RestTemplate restTemplate = new RestTemplate();
        Calculator firstNumber = restTemplate.getForObject("http://localhost:8080/Calculator/getResult",Calculator.class);

        return calculatorService.multiplyNumbers(firstNumber.getNumber().toString(),secondNumber);
    }

    @GetMapping(path = "/addNumberToPreviousNumber/{secondNumber}")
    public Calculator divideCalculators(@PathVariable String secondNumber) {

        RestTemplate restTemplate = new RestTemplate();
        Calculator firstNumber = restTemplate.getForObject("http://localhost:8080/Calculator/getResult",Calculator.class);

        return calculatorService.divideNumbers(firstNumber.getNumber().toString(),secondNumber);
    }
    @PostMapping(path = "/addDefault")
    public void addDefault(@RequestBody Object object)
    {
        System.out.println(object);
    }


    @GetMapping(path = "/addNumber/{firstNumber}:{secondNumber}")
    public Calculator addNumber(@PathVariable String firstNumber,  @PathVariable String secondNumber) {
        calculator = calculatorService.addNumbers(firstNumber,secondNumber);
        return calculatorService.addNumbers(firstNumber,secondNumber);
    }

    @GetMapping(path = "/substractNumber/{firstNumber}:{secondNumber}")
    public Calculator substractNumber(@PathVariable String firstNumber,  @PathVariable String secondNumber) {
        return calculatorService.substractNumbers(firstNumber,secondNumber);
    }

    @GetMapping(path = "/multiplyNumber/{firstNumber}:{secondNumber}")
    public Calculator multiplyNumber(@PathVariable String firstNumber,  @PathVariable String secondNumber) {
        return calculatorService.multiplyNumbers(firstNumber,secondNumber);
    }

    @GetMapping(path = "/divideNumber/{firstNumber}:{secondNumber}")
    public Calculator divideNumber(@PathVariable String firstNumber,  @PathVariable String secondNumber) {
        return calculatorService.divideNumbers(firstNumber,secondNumber);
    }

    @GetMapping("/getResult")
    public Calculator getResult(String number)
    {
        return calculator;
    }

    @GetMapping(path = "/displayResult")
    public Calculator displayResult()
    {
        return calculator;
    }

}
