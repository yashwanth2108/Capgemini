package com.example.question_4.Service;

import com.example.question_4.Model.CreditCard;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService{

    private String cardDigit;
    private Long digits;
    CreditCard creditCard;

    // checking digits are Numeric
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }


    @Override
    public String cardValidation(CreditCard creditCard) {
        if(creditCard.getCardType().equalsIgnoreCase("American Express") || creditCard.getCardType().equalsIgnoreCase("Visa") || creditCard.getCardType().equalsIgnoreCase("Discover"))
        {
            if(creditCard.getCardDigits().length()==16)
            {
                cardDigit = creditCard.getCardDigits().substring(0,6);
                if(isNumeric(cardDigit))
                {
                    digits = Long.parseLong(cardDigit);

                    if(digits>=601100 && digits<=601109)
                        return "Valid Credit Card";
                    else if(digits>=601120 && digits<=601149)
                        return "Valid Credit Card";
                    else if(digits==601174)
                        return "Valid Credit Card";
                    else if(digits>=601177 && digits<=601179)
                        return "Valid Credit Card";
                    else if(digits>=601186 && digits<=601199)
                        return "Valid Credit Card";
                    else if(digits>=644000 && digits<=650000)
                        return "Valid Credit Card";
                }
                else
                    return "Invalid Credit Card";
            }
            else
                return "Invalid Credit Card";
        }
        else if(creditCard.getCardType().equalsIgnoreCase("enRoute"))
        {
            if(creditCard.getCardDigits().length()==15)
            {
                cardDigit = creditCard.getCardDigits().substring(0,4);
                if(cardDigit.equals("2014") || cardDigit.equals("2149"))
                    return "Valid Credit Card";
            }
            else
                return "Invalid Credit Card";
        }
        else if(creditCard.getCardType().equalsIgnoreCase("JCB"))
        {
            if(creditCard.getCardDigits().length()>=16 || creditCard.getCardDigits().length() <=19)
            {
                cardDigit = creditCard.getCardDigits().substring(0,4);
                if(cardDigit.equals("3528") || cardDigit.equals("3589"))
                    return "Valid Credit Card";
            }
            else
                return "Invalid Credit Card";
        }
        else if(creditCard.getCardType().equalsIgnoreCase("MasterCard"))
        {
            if(creditCard.getCardDigits().length()==16)
            {
                cardDigit = creditCard.getCardDigits().substring(0,6);
                if(isNumeric(cardDigit)) {
                    int secondDigit = Character.getNumericValue(cardDigit.charAt(1));
                    if (cardDigit.charAt(0) == '5' && (1 <= secondDigit && secondDigit <= 5)) {
                        digits = Long.parseLong(cardDigit);
                        if(digits >=510000 && digits <=559999)
                            return "Valid Credit Card";
                    }
                    else if (cardDigit.charAt(0) == '2' && (2 <= secondDigit && secondDigit <= 7)) {
                        digits = Long.parseLong(cardDigit);
                        if(digits >=222100 && digits <=272099)
                            return "Valid Credit Card";
                    }
                    else
                        return "Invalid Credit Card";
                }
                else
                    return "Invalid Credit Card";
            }
            else
                return "Invalid Credit Card";
        }
        else
        {
            return "Invalid Credit Card";
        }
        return "Invalid Credit Card";
    }
}
