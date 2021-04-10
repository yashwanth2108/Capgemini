package com.example.question_4.Controller;

import com.example.question_4.Model.CreditCard;
import com.example.question_4.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @Autowired
    CardService cardService;

    @PostMapping(path = "/validateCreditCard")
    public String checkCreditCard(@RequestBody CreditCard creditCard)
    {
        return cardService.cardValidation(creditCard);
    }
    @GetMapping(path = "/validateCard")
    public CreditCard checkCard()
    {
        CreditCard creditCard = new CreditCard("Visa" , "6011051010120011");
        return cardService.cardValidation(creditCard).equalsIgnoreCase("Valid Credit Card") ? creditCard : creditCard;
    }

}
