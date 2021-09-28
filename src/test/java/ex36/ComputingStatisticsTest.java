package ex36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

class ComputingStatisticsTest {

    @Test
    void printNumbers() {
        int[] numbers = {5, 10, 15};
        assertEquals("Numbers: 5, 10, 15", ComputingStatistics.printNumbers( numbers ));
    }

    @Test
    void average() {
        int[] numbers = {5, 10, 15};
        assertEquals(10, ComputingStatistics.average( numbers ));
    }

    @Test
    void min() {
        int[] numbers = {5, 10, 15};
        assertEquals(5, ComputingStatistics.min( numbers ));
    }

    @Test
    void max() {
        int[] numbers = {5, 10, 15};
        assertEquals(15, ComputingStatistics.max( numbers ));
    }

    @Test
    void std() {
        int[] numbers = {5, 10, 15};
        assertEquals(4.08, ComputingStatistics.std( numbers , 10), .01);
    }
}