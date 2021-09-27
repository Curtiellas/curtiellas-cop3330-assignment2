package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class MagicEightBall
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        String[] answers = {"Yes.", "No.", "Maybe.", "Ask again later."};

        System.out.print("What's your question? \n> ");
        sc.nextLine(); //the question is not recorded

        //final output
        System.out.println( answers[ generateRandomNumber() ] );
    }

    public static int generateRandomNumber()
    {
        Random rnd = new Random();

        // 0 - 3
        return (rnd.nextInt(4));
    }

}