package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.Arrays;
import java.util.Scanner;

class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println( "Enter two strings and I'll tell you if they are anagrams:" );
        System.out.print( "Enter the first string: " );
        String word1 = sc.nextLine();
        System.out.print( "Enter the second string: " );
        String word2 = sc.nextLine();

        if (isAnagram (word1, word2))
            System.out.printf("\"%s\" and \"%s\" are anagrams", word1, word2);

        else
            System.out.printf("\"%s\" and \"%s\" are not anagrams", word1, word2);
    }

    public static boolean isAnagram( String word1, String word2)
    {
        //first check if words are not the same length
        if (word1.length() != word2.length())
            return false;

        //turning strings into char arrays so I can replace the matched chars
        //this way the same exact letter is not matched again
        //this remedies a case such as "oopp" = "ooop",
        //and would no longer output a false positive
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        char letter;
        int match;

        for (int a = 0; a < word1.length(); a++)
        {
            letter = charArray1[a];
            match = 0;

            for (int b = 0; b < word1.length(); b++)
            {
                if (letter == charArray2[b])
                {
                    charArray2[b] = '#';
                    match = 1;
                }
            }

            if (match == 0)
                return false;
        }

        return true;
    }
}