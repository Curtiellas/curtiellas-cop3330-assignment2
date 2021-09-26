package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 luis curtiellas
 */

//import java.text.DecimalFormat;
import java.util.*;

public class PaymentCalculator
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        //DecimalFormat df = new DecimalFormat("###.###");

        System.out.print("What is your balance? ");
        double balance = sc.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        double APR = sc.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        double payment = sc.nextDouble();

        double monthsToComplete = calculateMonthsUntilPaidOff(balance, APR, payment);
        int result = (int) Math.ceil(monthsToComplete);

        System.out.println( "It will take you " + result + " months to pay off this card." );
    }

    public static double calculateMonthsUntilPaidOff(double b, double APR, double p)
    {
        double n;
        double i = APR/(365.0 * 100);

        n = 1 + (b/p) * (1 - Math.pow((1 + i), 30));
        n = -(1/30.0) * (Math.log(n) / Math.log(1 + i));

        return n;
    }
/*
    n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)

    n is the number of months.
    i is the daily rate (APR divided by 365).
    b is the balance.
    p is the monthly payment.
*/
}