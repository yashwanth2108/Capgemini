package com.example.question_4.Model;

public class CreditCard {
    private String cardType;
    private String cardDigits;

    public CreditCard(String cardType, String cardDigits) {
        this.cardType = cardType;
        this.cardDigits = cardDigits;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardDigits() {
        return cardDigits;
    }

    public void setCardDigits(String cardDigits) {
        this.cardDigits = cardDigits;
    }
}
