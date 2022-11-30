/* Harrison Goehring 
 * Exercise No 1
 * Due Date: September 18 
 * Program Description: This program is designed to take in a user's integer input
 * and will sum the digits of that input. It will print the sum of the digits entered
 * to the console.*/

//Import our Scanner Java utility to allow for User Input
import java.util.Scanner;

public class DigitSum {

	public static void main(String args[]) {
            
	    //Creates a new Scanner Item
	    Scanner input = new Scanner(System.in);

	    //Asks the user to input a number between 0 and 1000
	    System.out.print("Enter a number between 0 and 1000: ");

            //Declares a variable to store our user's input
	    int userInput = input.nextInt();

	    //Closes the Scanner Object to prevent resource leak
	    input.close();

	    //Gets First Two Digits of the User Input Number
	    int firstTwoDigits = userInput / 10;

	    //Gets the First Digit of the User Input Number
	    int firstDigit = firstTwoDigits / 10;

	    //Gets the Second Digit of the User Input Number
	    int secondDigit = firstTwoDigits % 10;

	    //Gets the Third Digit of the User Input Number 
	    int thirdDigit = userInput % 10;

	    //Calculates the Sum of the Individual Digits of the User Input Number
	    int sum = firstDigit + secondDigit + thirdDigit;

	    //Prints the Sum of the Digits the User Entered
	    System.out.println("The sum of the digits is " + sum);

	}
}