package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class KarvonenHeartRate
{
    public static void main( String[] args )
    {
        System.out.print("This program will print a Karvonen Heart Rate table.\nEnter your age: ");
        double age = readAge();

        System.out.print("Enter your resting heart rate: ");
        double restingRate = readRestingRate();

        System.out.print("Intensity    | Rate\n-------------|--------\n");

        for (int i = 55; i <= 95; i = i + 5) {
            System.out.println(i + "%          | " + calculateBPM(age, restingRate, i) + " bpm");
        }
    }

    public static double readAge()
    {
        Scanner sc = new Scanner(System.in);

        String ageS;
        double age;

        while (true)
        {
            try {
                ageS = sc.next();
                age = Double.parseDouble(ageS);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Please enter a number greater than 0");
            }
        }

        //age can't be 0 or negative
        if (age <= 0)
            return readAge();

        else
            return age;
    }

    public static double readRestingRate()
    {
        Scanner sc = new Scanner(System.in);

        String rateS;
        double rate;

        while (true)
        {
            try {
                rateS = sc.next();
                rate = Double.parseDouble(rateS);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Please enter a number greater than 0");
            }
        }

        //age can't be 0 or negative
        if (rate <= 0)
            return readAge();

        else
            return rate;
    }

    public static int calculateBPM(double age, double restingRate, double intensity)
    {
        //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        return (int) Math.round( ((((220 - age) - restingRate) * (intensity / 100.0)) + restingRate) );
    }
}