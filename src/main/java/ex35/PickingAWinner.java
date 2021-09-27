package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class PickingAWinner
{
    public static void main( String[] args )
    {
        String[] candidates = readCandidates();

        if (candidates != null)
        {
            String winner = getWinner(candidates);
            System.out.println( "The winner is... " + winner );
        }

        else
            System.out.println("No names were entered.");
    }

    //read names
    public static String[] readCandidates()
    {
        Scanner sc = new Scanner(System.in);

        // Create an ArrayList object
        ArrayList <String> candidates = new ArrayList <String> ();
        String temp;

        do {
            System.out.print("Enter a name: ");
            temp = sc.nextLine();
            candidates.add(temp);

        } while (!temp.equals(""));

        //minimum size, when the list is empty
        if (candidates.size() == 1)
            return null;

        //removing the last, blank element
        candidates.remove(candidates.size() - 1);

        //create a string array to return to main
        String[] arrayCandidates = new String[candidates.size()];

        //copying over the elements to the string array
        for (int i = 0; i < candidates.size(); i++) {
            arrayCandidates[i] = candidates.get(i);
        }

        return arrayCandidates;
    }

    public static String getWinner(String[] candidates)
    {
        return candidates[generateRandomNumber(candidates.length)];
    }

    //random number generator with arbitrary ranges
    public static int generateRandomNumber(int limit)
    {
        Random rnd = new Random();

        // 0 to (limit - 1)
        return (rnd.nextInt(limit));
    }
}