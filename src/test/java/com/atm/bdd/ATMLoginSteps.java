package com.atm.bdd;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ATMLoginSteps {

    @Given("Thẻ ATM hợp lệ")
    public void validCard(){
        throw new PendingException();
    }
    @When("Chủ thẻ nhập đúng mã PIN")
    public void enter_pin(){
        throw new PendingException();
    }
    @Then("ATM cho phép truy cập")
    public void atmAllowsAccess(){
        throw new PendingException();
    }

}
