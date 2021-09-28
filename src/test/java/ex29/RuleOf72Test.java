package ex29;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

class RuleOf72Test {

    @Test
    void calculate() {
        assertEquals( 18, RuleOf72.calculate(4.0));
        assertEquals( 22, RuleOf72.calculate(3.25));
    }

    @Test
    void getOutput() {
        assertEquals( "It will take " + 8.0 + " years to double your initial investment." , RuleOf72.getOutput(8));
    }
}