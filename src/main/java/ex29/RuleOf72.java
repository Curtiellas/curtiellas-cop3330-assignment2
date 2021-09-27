package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class RuleOf72
{
    public static void main( String[] args )
    {
        System.out.print("What is the rate of return? ");
        double rate = readRate();

        //round up; 5.4 years becomes 6 years
        int yearsToDouble = (int) Math.ceil(72.0 / rate);

        System.out.println( "It will take " + yearsToDouble + " years to double your initial investment." );
    }

    public static double readRate()
    {
        Scanner sc = new Scanner(System.in);
        String numString;
        double num;

        //this try...catch recognizes if the input string is not a number,
        //the while loop continues to ask for input until a valid Double is entered
        while (true)
        {
            try {
                numString = sc.next();
                num = Double.parseDouble(numString);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input.");
            }
        }

        //recursively calls this function if the number is zero
        if (num == 0)
        {
            System.out.println("Sorry. That's not a valid input.");
            return readRate();
        }

        //both 'number format' and 'zero value' checks were passed!
        else
            return num;
    }
}