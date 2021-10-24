/**
* Maman 11 , first question.
* "Milliseconds"
* Name: @David Nalivkin
* TZ:332403468
* That main method receive number of "milliseconds" and convert
*  from "milliseconds" format to "days:hours:minutes:seconds" and print them.
*/
import java.util.Scanner;
public class Milliseconds
{
    public static void main (String [] args)
    {
        //finals and object scan
        final long DAYS ,HOURS, MINUTES, SECONDS, HOUR_MIN_SECOND = 60, SEC_MILISEC = 1000 ;
        Scanner scan = new Scanner (System.in);
        //print for input
        System.out.println ("This program reads an integer which " +
                "represents Milliseconds and converts it to days, " +
                "hours, minutes and seconds. ");
        System.out.println ("Please enter the number of Milliseconds:");
        long ms = scan.nextLong();
        // convert
        DAYS = ms / SEC_MILISEC / HOUR_MIN_SECOND / HOUR_MIN_SECOND / 24; //counts a days
        ms = ms - (DAYS * (24 * HOUR_MIN_SECOND * HOUR_MIN_SECOND * SEC_MILISEC)); // ms - days in milisec
        HOURS = ms / SEC_MILISEC / HOUR_MIN_SECOND / HOUR_MIN_SECOND; //counts hours
        ms = ms - (HOURS * (HOUR_MIN_SECOND * HOUR_MIN_SECOND * SEC_MILISEC)); // ms - hours in milisec
        MINUTES = ms / SEC_MILISEC / HOUR_MIN_SECOND; //counts minutes
        ms = ms - (MINUTES * (HOUR_MIN_SECOND * SEC_MILISEC)); // ms - minutes in milisec
        SECONDS = ms / SEC_MILISEC; // counts seconds
        //print output
        System.out.println(DAYS + " days " + HOURS + ":" + MINUTES + ":" + SECONDS + " hours");
    } // end of method main
} //end of class Milliseconds