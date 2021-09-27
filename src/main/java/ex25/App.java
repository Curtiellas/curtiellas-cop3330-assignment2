package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a password to determine its complexity: ");
        String password = sc.nextLine();

        int result = passwordValidator(password);
        String complexity = "cool password.";

        switch (result) {
            case 1:
            case 5: //defaults to 'very weak' if no other complexity was recognized
                complexity = "very weak password.";
                break;

            case 2:
                complexity = "weak password.";
                break;

            case 3:
                complexity = "strong password.";
                break;

            case 4:
                complexity = "very strong password.";
                break;
        }

        System.out.println("The password '" + password + "' is a " + complexity);
    }

    public static int passwordValidator(String password) {
        int containsNumber = 0, containsLetter = 0, EightChars = 0, containsSpecial = 0;

        char[] charArray = password.toCharArray();

        //does it contain at least 8 characters?
        if (password.length() >= 8)
            EightChars = 1;

        for (int a = 0; a < password.length(); a++) {

            //does it contain a number?
            if (Character.isDigit(charArray[a]))
                containsNumber++;

            //does it contain a letter?
            else if (Character.isLetter(charArray[a]))
                containsLetter++;

            //does it contain a special character?
            else if (!Character.isWhitespace(charArray[a]))
                containsSpecial++;
        }

        //very weak
        if (containsNumber > 0 && containsLetter == 0 && containsSpecial == 0 && EightChars == 0)
            return 1;
        //weak
        else if (containsNumber == 0 && containsLetter > 0 && containsSpecial == 0 && EightChars == 0)
            return 2;
        //strong
        else if (containsNumber > 0 && containsLetter > 0 && containsSpecial == 0 && EightChars > 0)
            return 3;
        //very strong
        else if (containsNumber > 0 && containsLetter > 0 && containsSpecial > 0 && EightChars > 0)
            return 4;

        //this may happen if the password does contain numbers, letters and/or special characters
        //but is less than 8 characters long
        else
            return 5;

    }
/*
1- A very weak password contains only numbers and is fewer than eight characters.
2- A weak password contains only letters and is fewer than eight characters.
3- A strong password contains letters and at least one number and is at least eight characters.
4- A very strong password contains letters, numbers, and special characters and is at least eight characters.
 */
}