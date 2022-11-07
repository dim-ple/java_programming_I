/* Harrison Goehring 
 * Programming Exercise No 2
 * Due Date: October 16, 2022 */

/*This program will allow the user to enter in the amount of students
 *in a given class, record their students names and scores, and will
 *print the Student with the highest score and what their highscore is */ 

 //Import our Java Scanner Utility to allow for User Input
import java.util.Scanner;

public class TopScore {
	
    public static void main(String args[]) {
        	
        Scanner input = new Scanner(System.in); //Creates a new Scanner Object
        int highestScore = 0; //Initialize variable to hold highest score
        String highestScoringStudent = ""; //Initialize variable to hold name of the highest scoring student
        	
        //Initial prompt to user to enter the number of students in class
        System.out.print("Enter the number of students in the class (the number should be greater than 0): "); 
        int numOfStudents = input.nextInt();
        	
        //Logic Control to ensure the number of students entered is greater than 0 before proceeding
        while (numOfStudents <= 0){
            System.out.println("Error: Enter a number greater than 0: ");
            numOfStudents = input.nextInt(); //Prompts the user to re-enter the number of students in the class
        }
        	
         //Loop control which uses a counter to track the student name and score inputs  
        for (int i = 0; i < numOfStudents; i++) {
            		
            //Prompt to the user to enter the student's first name
            System.out.println("Enter student " + (i+1) + "\'s first name: ");
            String name = input.next();
            		
            //Prompts the user to enter in the student's score
            System.out.println("Enter " + name + "\'s score: ");
            		
            int score = input.nextInt();
            		
            //Nested IF statement to track the highest score and student name
            if (score > highestScore) {
                highestScore = score;
                highestScoringStudent = name;
            }

        }
        	
        input.close(); //Closes the Scanner Object to prevent memory leak
        //Prints the first name of the student with the highest score and prints their score
        	
        System.out.println("The student with the highest score is " + highestScoringStudent);
        	
        System.out.println("Their score is " + highestScore);
    	}
}   