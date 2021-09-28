package ex39;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class SortingRecords
{
    public static void main( String[] args )
    {
        //list of maps
        ArrayList <Map <String, String>> emp = new ArrayList<>();

        //enter the values to the list
        fillList(emp);

        //sorts the list
        System.out.print("1. Last Name\n2. Position\n3. Separation Date\nEnter 1, 2, or 3 to decide the sort criteria: ");
        String sortOption = sortCriteria();

        //sort
        emp.sort(Comparator.comparing(map -> map.get(sortOption)));

        //print the entire table
        System.out.println( getTable(emp) );
    }

    public static void fillList( ArrayList <Map <String, String>> emp )
    {
        //first employee
        emp.add( Map.of ("First Name", "John", "Last Name", "Johnson", "Position", "Manager", "Separation Date", "2016-12-31"));

        //second employee
        emp.add( Map.of ("First Name", "Tou", "Last Name", "Xiong", "Position", "Software Engineer", "Separation Date", "2016-10-05"));

        //third employee
        emp.add( Map.of ("First Name", "Michaela", "Last Name", "Michaelson", "Position", "District Manager", "Separation Date", "2015-12-19"));

        //fourth employee
        emp.add( Map.of ("First Name", "Jake", "Last Name", "Jacobson", "Position", "Programmer", "Separation Date", ""));

        //fifth employee
        emp.add( Map.of ("First Name", "Jacquelyn", "Last Name", "Jackson", "Position", "DBA", "Separation Date", ""));

        //sixth employee
        emp.add( Map.of ("First Name", "Sally", "Last Name", "Webber", "Position", "Web Developer", "Separation Date", "2015-12-18"));
    }

    public static String getTable( ArrayList <Map <String, String>> emp )
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

        return table.toString();
    }

    public static String sortCriteria()
    {
        int num = readInt();

        if (num == 1)
            return "Last Name";

        else if (num == 2)
            return "Position";

        else //if (num == 3)
            return "Separation Date";
    }

    //reusable function to read strictly an Int
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
                System.out.print("Invalid input. Try again. ");
            }
        }

        if (num > 3 || num < 1)
        {
            System.out.print("Invalid input. Try again. ");
            return readInt();
        }

        else
            return num;
    }

}