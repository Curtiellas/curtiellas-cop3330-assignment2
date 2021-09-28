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
        System.out.println(getTable(12));;
    }

    public static String getTable(int size)
    {
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= size; j++) {
                if ( (i * j) < 10)
                    output.append("   ");

                else if ( (i * j) < 100)
                    output.append("  ");

                else if ( (i * j) < 1000)
                    output.append(" ");

                output.append( (i * j) );
            }

            //new line each row
            output.append("\n");
        }

        return output.toString();
    }
}