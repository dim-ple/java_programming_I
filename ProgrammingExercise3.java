/* Harrison Goehring 
 * Programming Exercise No 3
 * Due Date: November 13, 2022 */

 /*This program reads student scores, obtains the best score among those entered and then assigns grades based on a defined grading scale */

//Import our Java Scanner Utility to allow for User Input
import java.util.Scanner;

public class ProgrammingExercise3 {
 
    /*Our main method */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); //Creates a new Scanner Object
        
        System.out.print("Enter the number of students: "); //Prompts the user to enter in the number of students

        int numOfStudents = input.nextInt(); //Numbe of Students is initialized into a variable
        int[] scores = new int[numOfStudents]; //Initializes an empty list of scores where the length is the number of students
        char[] grades = new char[scores.length]; //Initializes an empty list of grades, length of which is the length of scores

        System.out.print("Enter " + scores.length + " scores: "); //Prompts the user to enter in a score for each student
        //Adds the user's score inputs to the score list
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }

        searchGrades(scores, grades); //Runs our searchGrades method

        //Prints our result for each student to the console
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);
        }

        input.close(); //Closes the Scanner Item to prevent memory leak
    }

    // This method will allow us to ascertain the highest score in a list of our choice
    public static int highestScore(int[] list) {
        
        int highestScore = list[0]; //Initialize a variable for the highest score beginning at our first indexed value of the list parameter

        /*Checks against the score values in the list to see if the current score is still the highest 
         *If not, the higher score replaces the lower score in the highestScore variable */
        for (int i = 1; i < list.length; i++) {
            if (list[i] > highestScore)
                highestScore = list[i];
        }
        return highestScore; //Returns our highest score
    }

    
    //This method seaches our scores from the scores list and then assigns a character grade after comparison with the highest score in the score list
    public static void searchGrades(int[] scores, char[] grades) {
        int best = highestScore(scores); //Initialize variable with highest score from score list by using the highestScore method
        
        /*Logic to apply character grades to the grades list upon comparison with the score and highest/best score*/
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= best - 10)
                grades[i] = 'A';
            else if (scores[i] >= best - 20)
                grades[i] = 'B';
            else if (scores[i] >= best - 30)
                grades[i] = 'C';
            else if (scores[i] >= best - 40)
                grades[i] = 'D';
            else
                grades[i] = 'F';
        }
    }

}
