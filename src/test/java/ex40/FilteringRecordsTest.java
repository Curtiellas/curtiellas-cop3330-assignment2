package ex40;

import ex39.SortingRecords;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FilteringRecordsTest {

    @Test
    void getSmallTable() {

        ArrayList <Map <String, String>> emp = new ArrayList<>();

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

        assertEquals("\nName                | Position           | Separation Date\n" +
                            "--------------------|--------------------|----------------\n" +
                            "Jacquelyn Jackson   | DBA                | \n" +
                            "Jake Jacobson       | Programmer         | \n" +
                            "John Johnson        | Manager            | 2016-12-31\n" +
                            "Michaela Michaelson | District Manager   | 2015-12-19\n", FilteringRecords.getSmallTable( emp, "son"));
    }
}