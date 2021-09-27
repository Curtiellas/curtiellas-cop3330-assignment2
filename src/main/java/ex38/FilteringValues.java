package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class FilteringValues
{
    public static void main( String[] args )
    {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        int[] allNumbers = readNumbers();
        int[] evenNumbers = filterEvenNumbers(allNumbers);

        System.out.println(finalOutput(evenNumbers));
    }

    public static int[] readNumbers()
    {
        Scanner sc = new Scanner(System.in);

        String numberString = sc.nextLine();
        String[] arraySpring = numberString.split("\\s+");
        int[] numbers = new int[arraySpring.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(arraySpring[i]);
        }

        return numbers;
    }

    public static int[] filterEvenNumbers(int[] numbers)
    {
        ArrayList<Integer> list = new ArrayList <Integer> ();
        int size = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
            {
                list.add(numbers[i]);
                size++;
            }
        }

        int[] evenNumbers = new int[size];

        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = list.get(i);
        }

        return evenNumbers;
    }

    public static String finalOutput(int[] numbers)
    {
        StringBuilder output = new StringBuilder();

        output.append("The even numbers are");

        for (int i = 0; i < numbers.length; i++) {
            output.append(" " + numbers[i]);
        }

        return output.toString();
    }

}