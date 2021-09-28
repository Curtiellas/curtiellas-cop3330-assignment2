package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class PasswordGenerator
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        int length = readInt();

        System.out.print("How many special characters? ");
        int specials = readInt();

        System.out.print("How many numbers? ");
        int numbers = readInt();

        String password = generatePassword(length + 1, specials, numbers);

        System.out.println( "Your password is " + password );
    }

    //reads strictly an Int
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
                System.out.println("Invalid input. Enter a positive integer.");
            }
        }

        return num;
    }

    public static String generatePassword(int length, int specials, int numbers)
    {
        StringBuilder password = new StringBuilder();
        int type;
        int actualLetters = 0, actualSpecials = 0, actualNumbers = 0;

        while (password.length() < length || specials > 0 || numbers > 0 || (actualSpecials + actualNumbers) > actualLetters) {

            if ( password.length() >= length )
            {
                if (specials > 0)
                    type = 0;   //only special

                else if (numbers > 0)
                    type = 1;   //only number

                else if ( (actualSpecials + actualNumbers) > actualLetters )
                    type = 2;   //only letters

                else
                {
                    System.out.println("error");
                    break;
                }
            }

            else
            {
                if (specials <= 0 && numbers <= 0)
                    type = 2;                                       //only letter

                else if (specials <= 0)
                    type = generateRandomNumber(1,3);   //number or letter

                else if (numbers <= 0)
                    type = 0;                                       //special only

                else
                    type = generateRandomNumber(0, 3);  //any character
            }

            //option 0: special
            if (type == 0)
            {
                password.append(getSpecial());
                specials--;
                actualSpecials++;
            }

            //option 1: number
            else if (type == 1)
            {
                password.append(getNumber());
                numbers--;
                actualNumbers++;
            }

            //option 2: fill in with letter
            else if (type == 2)
            {
                password.append(getLetter());
                actualLetters++;
            }

            else
                System.out.println("error");
        }

        return password.toString();
    }

    //random number generator
    public static int generateRandomNumber(int low, int high)
    {
        Random rnd = new Random();

        // low - (high - 1)
        return (low + rnd.nextInt(high));
    }

    public static String getSpecial()
    {
        ArrayList <String> specials = new ArrayList <String> ();
        specials.add("!");
        specials.add("@");
        specials.add("#");
        specials.add("$");
        specials.add("%");
        specials.add("^");
        specials.add("&");
        specials.add("*");
        specials.add("+");

        return specials.get(generateRandomNumber(0, 9));
    }

    public static String getNumber()
    {
        ArrayList <String> numbers = new ArrayList <String> ();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        numbers.add("6");
        numbers.add("7");
        numbers.add("8");
        numbers.add("9");

        return numbers.get(generateRandomNumber(0, 9));
    }

    public static String getLetter()
    {
        ArrayList <String> letters = new ArrayList <String> ();
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");
        letters.add("e");
        letters.add("f");
        letters.add("g");
        letters.add("h");
        letters.add("i");

        return letters.get(generateRandomNumber(0, 9));
    }

}