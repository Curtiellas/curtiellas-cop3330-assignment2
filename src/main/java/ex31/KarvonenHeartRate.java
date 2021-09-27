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
        int age = readAge();

        System.out.print("Enter your resting heart rate: ");
        int restingRate = readRestingRate();

        System.out.print("Intensity    | Rate\n-------------|--------\n");

        for (int i = 55; i <= 95; i = i + 5) {
            System.out.println(i + "%          | " + calculateBPM(age, restingRate, i / 100.0) + " bpm");
        }
    }

    public static int readAge()
    {
        Scanner sc = new Scanner(System.in);

        String ageS;
        int age;

        while (true)
        {
            try {
                ageS = sc.next();
                age = Integer.parseInt(ageS);
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

    public static int readRestingRate()
    {
        Scanner sc = new Scanner(System.in);

        String rateS;
        int rate;

        while (true)
        {
            try {
                rateS = sc.next();
                rate = Integer.parseInt(rateS);
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

    public static int calculateBPM(int age, int restingRate, double intensity)
    {
        double BPM = ((((220 - age) - restingRate) * intensity) + restingRate);

        //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        return (int) BPM;

    }
}