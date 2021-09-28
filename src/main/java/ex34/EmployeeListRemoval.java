package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class EmployeeListRemoval {
    public static void main(String[] args) {

        //original array of names
        String[] names = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        System.out.println("There are " + names.length + " employees:");

        //prints list of names
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\nEnter an employee name to remove: ");
        String removeName = readString();



        System.out.println( getOutput( names, removeName) );
    }

    public static String readString() {
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }

    public static String getOutput(String[] names, String removeName) {
        int a;
        String[] namesNew = new String[names.length - 1];
        boolean signal = false;

        //copying the first half of the names to the new list until finding the name to be removed
        for (a = 0; a < namesNew.length; a++) {
            if (!removeName.equalsIgnoreCase(names[a]) && !signal) {
                namesNew[a] = names[a];
            } else {
                signal = true;
                namesNew[a] = names[a + 1];
            }
        }

        if (!signal)
            if (removeName.equalsIgnoreCase(names[names.length - 1]))
                signal = true;

        StringBuilder output = new StringBuilder();

        if (signal) {
            output.append("\nThere are ").append(namesNew.length).append(" employees:");

            //list gathered
            for (String name : namesNew) {
                output.append("\n").append(name);
            }
        }

        else {
            output.append("\nThere are ").append(names.length).append(" employees:");

            //list gathered
            for (String name : names) {
                output.append("\n").append(name);
            }
        }

        return output.toString();
    }
}