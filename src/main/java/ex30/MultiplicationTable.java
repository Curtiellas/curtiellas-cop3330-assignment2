package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class MultiplicationTable
{
    public static void main( String[] args )
    {
        for (int i = 1; i <= 12; i++) {

            for (int j = 1; j <= 12; j++) {
                if ( (i * j) < 10)
                    System.out.print("   ");

                else if ( (i * j) < 100)
                    System.out.print("  ");

                else if ( (i * j) < 1000)
                    System.out.print(" ");

                System.out.print( (i * j) );
            }

            //new line each row
            System.out.print("\n");
        }
    }
}