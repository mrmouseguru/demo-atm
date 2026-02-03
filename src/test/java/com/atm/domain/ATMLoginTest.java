package com.atm.domain;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
public class ATMLoginTest {

    @Test
    public void loginSucessWhenPinIsCorrect(){
        ATM atm = new ATM();
        boolean result = atm.login("9999");
        assertTrue(result);
    }
    @Test
     public void loginSucessWhenPinWrong(){
        ATM atm = new ATM();
        boolean result = atm.login("1234");
        assertFalse(result);
    }
    @Test
    public void loginRequiresCardAndPin()
    {
        ATM atm = new ATM();
        Card card = new Card();
        boolean ressult = atm.login(card, "9999");
        assertTrue(ressult);
    }
@Test
    public void atmShouldDelegateCheckPinToPank(){
        Bank bank = new FakeBank();
        ATM atm = new ATM(bank);
        Card card = new Card();
       assertTrue(atm.login(card, "9999"));
    }





}
