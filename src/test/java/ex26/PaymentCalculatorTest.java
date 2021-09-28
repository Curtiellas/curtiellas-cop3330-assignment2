package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        assertEquals( 70, PaymentCalculator.calculateMonthsUntilPaidOff( 5000, 12, 100));
        assertEquals( 29, PaymentCalculator.calculateMonthsUntilPaidOff( 5000, 12, 200));
        assertEquals( 12, PaymentCalculator.calculateMonthsUntilPaidOff( 5000, 20, 500));

    }
}