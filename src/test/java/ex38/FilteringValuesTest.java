package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

class FilteringValuesTest {

    @Test
    void filterEvenNumbers() {
        assertArrayEquals(new int[]{2, 4, 6, 8}, FilteringValues.filterEvenNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertArrayEquals(new int[]{0, 2, 4, 6, 8}, FilteringValues.filterEvenNumbers(new int[]{0, 2, 3, 4, 5, 6, 7, 8}));
    }

    @Test
    void finalOutput() {
        assertEquals("The even numbers are 2 4 6 8", FilteringValues.finalOutput(new int[]{2, 4, 6, 8}));
        assertEquals("The even numbers are 0 2 4 6 8", FilteringValues.finalOutput(new int[]{0, 2, 4, 6, 8}));
    }
}