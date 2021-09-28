package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

class AppTest {

    @Test
    void isAnagram() {
        assertTrue( App.isAnagram("good", "doog") );
        assertTrue( App.isAnagram("tone", "note") );
        assertFalse( App.isAnagram("aaa", "aa") );
        assertFalse( App.isAnagram("aa", "aaa") );
        assertFalse( App.isAnagram("oopp", "ooop") );
        assertFalse( App.isAnagram("ooop", "oopp") );
    }
}
