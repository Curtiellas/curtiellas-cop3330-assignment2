package ex35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

class PickingAWinnerTest {

    @Test
    void generateRandomNumber() {
        assertFalse(PickingAWinner.generateRandomNumber(5) > 4);
        assertFalse(PickingAWinner.generateRandomNumber(5) < 0);

    }
}