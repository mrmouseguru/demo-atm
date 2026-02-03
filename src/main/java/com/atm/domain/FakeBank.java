package com.atm.domain;

public class FakeBank implements Bank{

    @Override
    public boolean verify(Card card, String pin) {
        return pin.equals("9999");
    }

}
