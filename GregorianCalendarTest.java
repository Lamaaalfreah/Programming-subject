
package gregoriancalendartest;
import java.util.Date;
import java.util.GregorianCalendar;
/*
* Challenge Question – Using GregorianCalendar and Date classes:
* (Use the GregorianCalendar class) Java API has the Date class and GregorianCalendar class in the java.util package,
which you can use to obtain the current date with specific details like
current year, current month, current day of a date and so on.

Write a program to perform these tasks:
1- Display the current year, month, and day.
2- Display the current date by using the toString() method from the Date class.
3- Display the current time –which is used to display the number of milliseconds‐ 
   by using getTime() method from the Date class. We will use it in the step 17.
4- Display the current year by using get(GregorianCalendar.YEAR) method from the GregorianCalendar class.
5- Display the current year by using get(GregorianCalendar.MONTH) method from the GregorianCalendar class.
   Note: this method ‐which is used for month‐ starts from 0 to 11 (0 indicates January).
   You must take care about this issue for adding 1 in order to display 1 for January.
6- Display the current Day by using get(GregorianCalendar.DAY_OF_MONTH) method from the GregorianCalendar class.
7- Display the current Week by using get(GregorianCalendar.DAY_OF_WEEK) method from the GregorianCalendar class.
8- Display the current DAY OF WEEK IN MONTH by using get(GregorianCalendar.DAY_OF_WEEK_IN_MONTH) method from the GregorianCalendar class.
9- Display the current Day of Year by using get(GregorianCalendar.DAY_OF_YEAR)
10- Display the current Hour by using get(GregorianCalendar.HOUR)
11- Display the current Hour of day by using get(GregorianCalendar.HOUR_OF_DAY)
12- Display the current MINUTE by using get(GregorianCalendar.MINUTE)
13- Display the current Second by using get(GregorianCalendar.SECOND)
14- Display the current Millisecond by using get(GregorianCalendar.MILLISECOND)
15- Display the current Week of month by using get(GregorianCalendar.WEEK_OF_MONTH)
16- Display the current Week of year by using get(GregorianCalendar.WEEK_OF_YEAR)
17- Finally, use setTime() method which sets your current time (Step 3) and display your
date and time using the toString() method after adding these milliseconds (In for loop):
1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, and 100000000000.
*/
public class GregorianCalendarTest
{
    public static void main(String[] args)
    {
     Date Date1 = new Date();
     System.out.println("Current date: " + Date1.toString());
     System.out.println("Current time (the number of milliseconds): " + Date1.getTime());
     
     GregorianCalendar GregorianCalendar1 = new GregorianCalendar();
     System.out.println("Current year: " + GregorianCalendar1.get(GregorianCalendar1.YEAR));
     System.out.println("Current month: " + GregorianCalendar1.get(GregorianCalendar1.MONTH));
     System.out.println("Current day: " + GregorianCalendar1.get(GregorianCalendar1.DAY_OF_MONTH));
     System.out.println("Current week: " + GregorianCalendar1.get(GregorianCalendar1.DAY_OF_WEEK));
     System.out.println("Current day of week in month: " + GregorianCalendar1.get(GregorianCalendar1.DAY_OF_WEEK_IN_MONTH));
     System.out.println("Current day of year: " + GregorianCalendar1.get(GregorianCalendar1.DAY_OF_YEAR));
     System.out.println("Current hour: " + GregorianCalendar1.get(GregorianCalendar1.HOUR));
     System.out.println("Current day of hour of day: " + GregorianCalendar1.get(GregorianCalendar1.HOUR_OF_DAY));
     System.out.println("Current minute: " + GregorianCalendar1.get(GregorianCalendar1.MINUTE));
     System.out.println("Current second: " + GregorianCalendar1.get(GregorianCalendar1.SECOND));
     System.out.println("Current Millisecond: " + GregorianCalendar1.get(GregorianCalendar1.MILLISECOND));
     System.out.println("Current week of month: " + GregorianCalendar1.get(GregorianCalendar1.WEEK_OF_MONTH));
     System.out.println("Current week of year: " + GregorianCalendar1.get(GregorianCalendar1.WEEK_OF_YEAR));
     
     System.out.println("---------------------------------");

     long number = 1;
     for (int i = 0; i < 12; i++)
     {
      Date1.setTime(Date1.getTime() + number);
      System.out.println("The time after adding " + number + " millisecond(s): " + Date1.toString());
      number *= 10;
     }// end of for.
    }// end of main.
}// end of GregorianCalendarTest.










