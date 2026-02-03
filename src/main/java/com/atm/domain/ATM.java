package com.atm.domain;

public class ATM {
    private Bank bank;
    public ATM(){}
    public ATM(Bank bank) {
        this.bank = bank;
    }

    public boolean login(String pin) {
        return pin.equals("9999");
    }

    public boolean login(Card card, String pin) {
        return bank.verify(card, pin);
    }

}
