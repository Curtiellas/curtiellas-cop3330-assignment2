package ex40;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class FilteringRecords
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        //list of maps
        ArrayList <Map <String, String>> emp = new ArrayList<>();

        //enter the values to the list
        fillList(emp);

        //read the user's string to search
        System.out.print("Enter a search string: ");
        String search = sc.nextLine();

        //print the table with the found employees
        System.out.println( getSmallTable(emp, search) );
    }

    public static void fillList( ArrayList <Map <String, String>> emp )
    {
        //first employee
        emp.add( Map.of ("First Name", "Jacquelyn", "Last Name", "Jackson", "Position", "DBA", "Separation Date", ""));

        //second employee
        emp.add( Map.of ("First Name", "Jake", "Last Name", "Jacobson", "Position", "Programmer", "Separation Date", ""));

        //third employee
        emp.add( Map.of ("First Name", "John", "Last Name", "Johnson", "Position", "Manager", "Separation Date", "2016-12-31"));

        //fourth employee
        emp.add( Map.of ("First Name", "Michaela", "Last Name", "Michaelson", "Position", "District Manager", "Separation Date", "2015-12-19"));

        //fifth employee
        emp.add( Map.of ("First Name", "Sally", "Last Name", "Webber", "Position", "Web Developer", "Separation Date", "2015-12-18"));

        //sixth employee
        emp.add( Map.of ("First Name", "Tou", "Last Name", "Xiong", "Position", "Software Engineer", "Separation Date", "2016-10-05"));
    }

    public static String getSmallTable( ArrayList <Map <String, String>> emp, String search )
    {
        //string creation
        StringBuilder table = new StringBuilder();

        String first, last, position, date, name;

        table.append("\nName                | Position           | Separation Date\n");
        table.append("--------------------|--------------------|----------------\n");

        for (int a = 0; a < emp.size(); a++)
        {
            first = emp.get(a).get("First Name");
            last = emp.get(a).get("Last Name");
            name = first + " " + last;

            position = emp.get(a).get("Position");
            date = emp.get(a).get("Separation Date");

            //check that the string is in the current employee's name
            if ( name.contains(search) )
            {
                //////////begin constructing table
                table.append( name );

                for (int i = 0; i < (20 - name.length()); i++) {
                    table.append(" ");
                }

                table.append( "| " + position );

                for (int i = 0; i < (19 - position.length()); i++) {
                    table.append(" ");
                }

                table.append( "| " + date + "\n" );
            }
        }

        return table.toString();
    }
}