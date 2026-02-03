package com.atm.bdd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.atm.domain.*;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ATMLoginSteps {
    ATM atm;
    Card card;
    boolean result;
    @Given("Thẻ ATM hợp lệ")
    public void validCard(){
        card = new Card();
        atm = new ATM(new FakeBank());
    }
    @When("Chủ thẻ nhập đúng mã PIN")
    public void enter_pin(){
       result =  atm.login(card, "9999");
    }
    @Then("ATM cho phép truy cập")
    public void atmAllowsAccess(){
        assertTrue(result);
    }

}
