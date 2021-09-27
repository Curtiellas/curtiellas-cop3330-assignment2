package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

class GlobalVariable {
    static int tries;
}

public class GuessTheNumber
{
    public static void main( String[] args )
    {
        String wantToPlay = "y";
        int difficulty;
        int target;
        GlobalVariable.tries = 0;

        while (wantToPlay.equalsIgnoreCase("y"))
        {
            System.out.println("Let's play Guess the Number!\n");
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
                difficulty = readInt();

            target = generateRandomNumber(difficulty);

            System.out.print("I have my number. What's your guess? ");

            guessLoop(target);

            System.out.println("You got it in " + GlobalVariable.tries + " guesses!");

            System.out.print("\nDo you wish to play again (Y/N)? ");
            wantToPlay = readChar();
        }
    }

    public static int readInt()
    {
        Scanner sc = new Scanner(System.in);

        String numS;
        int num;

        while (true)
        {
            try {
                //Here we count every instance of the user entering
                //a number guess, even if invalid.
                //When reading a number not intended as a guess, it is still added to the count,
                //but the count is reset right before the actual guesses are prompted
                GlobalVariable.tries++;

                numS = sc.next();
                num = Integer.parseInt(numS);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again.");
            }
        }

        //the number entered cannot be 0 or less
        //recursively call the function to read another number
        if (num < 1)
            return readInt();

        else
            return num;
    }

    public static String readChar()
    {
        Scanner sc = new Scanner(System.in);

        return sc.next();
    }

    public static int generateRandomNumber(int difficulty)
    {
        Random rnd = new Random();

        // 1 - 10
        if (difficulty == 1)
            return (1 + rnd.nextInt(10));

        // 1 - 100
        else if (difficulty == 2)
            return 1 + rnd.nextInt(100);

        // 1 - 1000
        else //(difficulty == 3)
            return 1 + rnd.nextInt(1000);
    }

    public static void guessLoop (int target)
    {
        GlobalVariable.tries = 0;
        int guess = readInt();

        while (guess != target)
        {
            if (guess < target)
                System.out.print("Too low. Guess again: ");

            else
                System.out.print("Too high. Guess again: ");

            guess = readInt();
        }
    }

}