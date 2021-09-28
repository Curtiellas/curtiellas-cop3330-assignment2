package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

class AppTest {

    @Test
    void passwordValidator() {
        assertEquals(1, App.passwordValidator("1234567"));
        assertEquals(5, App.passwordValidator("12345678")); //defaults to weak bc only numbers

        assertEquals(2, App.passwordValidator("abcdefg"));
        assertNotEquals(2, App.passwordValidator("abcdefge"));

        assertEquals(3, App.passwordValidator("abc1poxy"));

        assertEquals(4, App.passwordValidator("1337h@xor!"));
        assertEquals(4, App.passwordValidator("654321!a"));
    }
}