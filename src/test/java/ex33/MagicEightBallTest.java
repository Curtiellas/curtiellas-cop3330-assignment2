package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

class MagicEightBallTest {

    @Test
    void generateRandomNumber() {
        //range of random generation is tested
        assertFalse(MagicEightBall.generateRandomNumber(4) > 3);
        assertFalse(MagicEightBall.generateRandomNumber(4) < 0);

    }
}