package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

class EmployeeListRemovalTest {

    @Test
    void printOutput() {
        String[] names = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String john = names[0];
        String jackie = names[1];
        String chris = names[2];
        String amanda = names[3];
        String jeremy = names[4];

        assertEquals("\nThere are 5 employees:" +
                            "\nJohn Smith" +
                            "\nJackie Jackson" +
                            "\nChris Jones" +
                            "\nAmanda Cullen" +
                            "\nJeremy Goodwin", EmployeeListRemoval.getOutput( names, "bleep bloop"));

        assertEquals("\nThere are 4 employees:" +
                "\nJackie Jackson" +
                "\nChris Jones" +
                "\nAmanda Cullen" +
                "\nJeremy Goodwin", EmployeeListRemoval.getOutput( names, john));

        assertEquals("\nThere are 4 employees:" +
                "\nJohn Smith" +
                "\nChris Jones" +
                "\nAmanda Cullen" +
                "\nJeremy Goodwin", EmployeeListRemoval.getOutput( names, jackie));

        assertEquals("\nThere are 4 employees:" +
                "\nJohn Smith" +
                "\nJackie Jackson" +
                "\nAmanda Cullen" +
                "\nJeremy Goodwin", EmployeeListRemoval.getOutput( names, chris));

        assertEquals("\nThere are 4 employees:" +
                "\nJohn Smith" +
                "\nJackie Jackson" +
                "\nChris Jones" +
                "\nJeremy Goodwin", EmployeeListRemoval.getOutput( names, amanda));

        assertEquals("\nThere are 4 employees:" +
                "\nJohn Smith" +
                "\nJackie Jackson" +
                "\nChris Jones" +
                "\nAmanda Cullen", EmployeeListRemoval.getOutput( names, jeremy));
    }
}