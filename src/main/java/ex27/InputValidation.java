package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class InputValidation {
    public static void main(String[] args) {

        if (validateFunction())
            System.out.println("There were no errors found.");
    }

    public static boolean validateFunction() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = sc.next();


        System.out.print("Enter the last name: ");
        String lastName = sc.next();

        System.out.print("Enter the ZIP code: ");
        String ZIP = sc.next();

        System.out.print("Enter the employee ID: ");
        String ID = sc.next();

        //validations
        boolean firstNameFilled = fnf(firstName);
        boolean lastNameFilled = lnf(lastName);
        boolean firstOverTwoChar = fotc(firstName);
        boolean lastOverTwoChar = lotc(lastName);
        boolean correctIDFormat = cif(ID);
        boolean numberZIP = nz(ZIP);

        if (!firstNameFilled)
            System.out.println("The first name must be filled in.");

        if (!lastNameFilled)
            System.out.println("The last name must be filled in.");

        if (!firstOverTwoChar)
            System.out.println("The first name must be at least 2 characters long.");

        if (!lastOverTwoChar)
            System.out.println("The last name must be at least 2 characters long.");

        if (!correctIDFormat)
            System.out.println("The employee ID must be in the format of AA-1234.");

        if (!numberZIP)
            System.out.println("The zipcode must be a 5 digit number.");

        //iff no input problem return true, otherwise, if input problem/s return false
        return firstNameFilled && lastNameFilled && firstOverTwoChar && lastOverTwoChar && correctIDFormat && numberZIP;
    }

    public static boolean fnf(String firstName) {
        return !firstName.isEmpty();
    }

    public static boolean lnf(String lastName) {
        return !lastName.isEmpty();
    }

    public static boolean fotc(String firstName) {
        return firstName.length() > 1;
    }

    public static boolean lotc(String lastName) {
        return lastName.length() > 1;
    }

    public static boolean cif(String ID) {
        //format: AA-1234. Two letters, a hyphen, and four numbers.
        if (ID.length() > 7)
            return false;

        char[] charArray = ID.toCharArray();

        //check two first letters
        for (int a = 0; a < 2; a++)
            if (!Character.isLetter(charArray[a]))
                return false;

        //check hyphen
        if (charArray[2] != '-')
            return false;

        //check last 4 numbers
        for (int a = 3; a < ID.length(); a++)
            if (!Character.isDigit(charArray[a]))
                return false;

        //all checks passed
        return true;
    }

    public static boolean nz(String ZIP) {
        char[] charArray = ZIP.toCharArray();

        //check if it is a number
        for (int a = 0; a < ZIP.length(); a++)
            if (!Character.isDigit(charArray[a]))
                return false;

        return true;
    }
}