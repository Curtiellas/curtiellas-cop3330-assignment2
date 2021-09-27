package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

class InputValidationTest {

    @Test
    void fnf() {
        assertTrue(InputValidation.fnf("A"));
        assertFalse(InputValidation.fnf(""));
    }

    @Test
    void lnf() {
        assertTrue(InputValidation.fnf("A"));
        assertFalse(InputValidation.fnf(""));
    }

    @Test
    void fotc() {
        assertTrue(InputValidation.fotc("Aa"));
        assertTrue(InputValidation.fotc("Aaa"));
        assertFalse(InputValidation.fotc("A"));
    }

    @Test
    void lotc() {
        assertTrue(InputValidation.lotc("Aa"));
        assertTrue(InputValidation.lotc("Aaa"));
        assertFalse(InputValidation.lotc("A"));
    }

    @Test
    void cif() {
        assertTrue(InputValidation.cif("eW-7924"));
        assertTrue(InputValidation.cif("TK-4321"));
        assertFalse(InputValidation.cif("T-K7942"));
        assertFalse(InputValidation.cif("TK7-942"));
        assertFalse(InputValidation.cif("TK79429"));

    }

    @Test
    void nz() {
        assertTrue(InputValidation.nz("98745"));
        assertTrue(InputValidation.nz("9"));
        assertFalse(InputValidation.nz(""));
        assertFalse(InputValidation.nz("32453S"));

    }
}