package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class AddingNumbers
{
    public static void main( String[] args )
    {
        int[] numbers = readNumbers(5);

        System.out.println( "The total is " + addNumbers(numbers) + "." );
    }

    public static int[] readNumbers(int howMany)
    {
        int[] numbers = new int[howMany];

        for (int i = 0; i < howMany; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = readInt();
        }

        return numbers;
    }

    //reusable function to read strictly an Int
    public static int readInt()
    {
        Scanner sc = new Scanner(System.in);

        String numS;
        int num;

        while (true)
        {
            try {
                numS = sc.next();
                num = Integer.parseInt(numS);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Try again. ");
            }
        }

        return num;
    }

    public static int addNumbers(int[] numbers)
    {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }
}