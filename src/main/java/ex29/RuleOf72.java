package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class RuleOf72 {
    public static void main(String[] args) {
        System.out.print("What is the rate of return? ");
        double rate = readRate();

        int yearsToDouble = calculate(rate);

        System.out.println( getOutput(yearsToDouble) );
    }

    public static double readRate() {
        //reads until a number is recorded
        double num = readDouble();

        //recursively calls this function if the number is zero
        if (num == 0) {
            System.out.print("Invalid input. Do not enter zero. ");
            return readRate();
        }

        //both 'number format' and 'zero value' checks were passed!
        else
            return num;
    }


    //this try...catch recognizes if the input string is not a number,
    //the while loop continues to ask for input until a valid Double is entered
    public static double readDouble() {
        Scanner sc = new Scanner(System.in);

        String numS;
        double num;

        while (true) {
            try {
                numS = sc.next();
                num = Double.parseDouble(numS);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Enter a number. ");
            }
        }

        return num;
    }

    public static int calculate(double rate) {
        return (int) (72.0 / rate);
    }

    public static String getOutput(double years) {
        return "It will take " + years + " years to double your initial investment.";
    }
}