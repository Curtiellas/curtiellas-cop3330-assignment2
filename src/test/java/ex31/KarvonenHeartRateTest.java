package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

class KarvonenHeartRateTest {

    @Test
    void calculateBPM() {
        assertEquals(138, KarvonenHeartRate.calculateBPM( 22, 65 , 55));
        assertEquals(145, KarvonenHeartRate.calculateBPM( 22, 65 , 60));
        assertEquals(151, KarvonenHeartRate.calculateBPM( 22, 65 , 65));

        assertEquals(178, KarvonenHeartRate.calculateBPM( 22, 65 , 85));
        assertEquals(185, KarvonenHeartRate.calculateBPM( 22, 65 , 90));
        assertEquals(191, KarvonenHeartRate.calculateBPM( 22, 65 , 95));
    }
}