/**
* Maman 11 question 2
* "Einstein"
* Name: @David Nalivkin
* TZ:332403468
* That program issues Einstein game that user give a number and after few steps its equals to magic number
*/
import java.util.Scanner;

public class Einstein {
    public static void main(String[]args) {
        //variables in use
        final int MAGIC_NUMBER = 1089;
        int diff_input = 0,input_number,inverted_input,inverted_diff;
        // prints for start game and to receive input
        System.out.println("Welcome to the Einstein magic game.");
        System.out.println("Please enter a 3 digit positive number whose first and last digits are different:");
        //scanner line for input
        Scanner scan = new Scanner(System.in);
        input_number = scan.nextInt(); // receive number
        if( (input_number > 999 || input_number < 100) || input_number % 10 == input_number / 100){ //number correct if positive and have 3 digits that first and last are different
            if (input_number % 10 == input_number / 100) //checks the first and last digit
                System.out.println("First and last digits of the number should be different");
            if (input_number > 999 || input_number < 100) //checks if 3 digit positive number
                System.out.println("The number you entered is not a 3 digit positive number");
        }
        else {  //if the number legal
            System.out.println("User number is: " + input_number);// print if the number correct
            inverted_input = 100 *(input_number % 10) + input_number / 100 + 10 * ((input_number / 10) % 10);//hundreds + tenths + units
            diff_input = Math.abs(input_number - inverted_input); // count difference when input number higher
            System.out.println("Difference: " + diff_input ); // print difference
            inverted_diff = 100 *(diff_input % 10) + diff_input / 100 + 10 * ((diff_input / 10) % 10); //count inverted difference
            System.out.println("Reversed difference: " + inverted_diff); // print inverted difference
            if (MAGIC_NUMBER == inverted_diff + diff_input) //check if that succeeded
                System.out.println("SUCCEEDED");
            else
                System.out.println("FAILED");
        }
    } //end of main method
} //end of Einstein class
