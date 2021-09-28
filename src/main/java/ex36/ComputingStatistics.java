package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class ComputingStatistics
{
    public static void main( String[] args )
    {
        int[] responseTimes = readTimes();
        System.out.println( printNumbers(responseTimes) );

        double average = average(responseTimes);

        System.out.println("\nThe average is " + Math.round(average * 100.0) / 100.0);
        System.out.println("The minimum is " + min(responseTimes));
        System.out.println("The maximum is " + max(responseTimes));
        System.out.println("The standard deviation is " + Math.round(std(responseTimes, average) * 100.0) / 100.0);
    }

    public static int[] readTimes()
    {
        Scanner sc = new Scanner(System.in);

        // Create an ArrayList object
        ArrayList <Integer> times = new ArrayList <Integer> ();
        String temp;

        while (true)
        {
            try {
                System.out.print("Enter a number: ");
                temp = sc.next();
                if (temp.equalsIgnoreCase("done"))
                    break;
                times.add(Integer.parseInt(temp));
                //break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number or \"done\" to finish.");
            }
        }

        int[] array = new int[times.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = times.get(i);
        }

        return array;
    }

    public static String printNumbers(int[] times)
    {
        StringBuilder output = new StringBuilder();

        output.append("Numbers: ");

        for (int i = 0; i < times.length; i++) {
            if (i == times.length - 1)
                output.append( times[i] );
            else
                output.append( times[i] + ", ");
        }

        return output.toString();
    }

    public static double average ( int [] times )
    {
        int result = 0;
        double size = times.length;

        for (int i = 0; i < size; i++) {
            result += times[i];
        }

        return (result / size);
    }

    public static int min ( int [] times )
    {
        int min = times[0];

        for (int i = 1; i < times.length; i++) {
            if (times[i] < min)
                min = times[i];
        }

        return min;
    }

    public static int max ( int [] times )
    {
        int max = times[0];

        for (int i = 1; i < times.length; i++) {
            if (times[i] > max)
                max = times[i];
        }

        return max;
    }

    public static double std ( int [] times, double average )
    {
        double size = times.length;
        double[] deviations = new double[times.length];
        double variance = 0;
        double std;

        //deviation of each data value
        for (int i = 0; i < size; i++) {
            deviations[i] = Math.pow((times[i] - average), 2);
        }

        //the variance is the mean of deviations
        for (int i = 0; i < size; i++) {
            variance += deviations[i];
        }

        //variance is the mean of deviations
        variance = variance / size;

        //the population standard deviation is equal to the square root of the variance
        std = Math.pow(variance, 0.5);

        return std;
    }
}