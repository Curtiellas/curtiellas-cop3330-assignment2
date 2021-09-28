package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

class GuessTheNumberTest {

    @Test
    void generateRandomNumber() {
        //correct ranges are tested
        assertFalse(GuessTheNumber.generateRandomNumber(1) > 10);
        assertFalse(GuessTheNumber.generateRandomNumber(1) < 1);

        assertFalse(GuessTheNumber.generateRandomNumber(2) > 100);
        assertFalse(GuessTheNumber.generateRandomNumber(2) < 1);

        assertFalse(GuessTheNumber.generateRandomNumber(3) > 1000);
        assertFalse(GuessTheNumber.generateRandomNumber(3) < 1);
    }

}