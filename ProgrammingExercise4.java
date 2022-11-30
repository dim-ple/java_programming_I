/* Harrison Goehring
 * Programming exercise No 4
 * Due date: December 4, 2022
 * Program Description:
 * This program loads all 50 US States and their capitals. It then asks the user
 * to name the capital for each US state. The program gives feedback to the user
 * on whether or not they got the capital correct and counts how many state capitals
 * were guessed correctly. Once all state capitals are guessed, the program tells the
 * user how many they guessed correctly */

import java.util.Scanner; //Import our Scanner utility

public class StateCapitalQuiz {
	
    public static void main(String args[]) {
       
        //Declare our Two-Dimensional Array of States and their Capitals
        String[][] statesAndCapitals = {
            {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"}, {"Arkansas", "Little Rock"}, {"California", "Sacramento"},
            {"Colorado", "Denver"}, {"Connecticut", "Hartford"}, {"Deleware", "Dover"}, {"Florida", "Tallahassee"},
            {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"}, {"Idaho", "Boise"}, {"Illinois", "Springfield"},
            {"Indiana", "Indianapolis"}, {"Iowa", "Des Moines"}, {"Kansas", "Topeka"}, {"Kentucky", "Frankfurt"},
            {"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"}, {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
            {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"}, {"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"},
            {"Montana", "Helena"}, {"Nebraska", "Lincoln"}, {"Nevada", "Carson City"}, {"New Hampshire", "Concord"},
            {"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"}, {"New York", "Albany"}, {"North Carolina", "Raleigh"},
            {"North Dakota", "Bismarck"}, {"Ohio", "Columbus"}, {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"},
            {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"}, {"South Carolina", "Columbia"},
            {"South Dakota", "Pierre"}, {"Tennessee", "Nashville"}, {"Texas", "Austin"}, {"Utah", "Salt Lake City"},
            {"Vermont", "Montpelier"}, {"Virginia", "Richmond"}, {"Washington", "Olympia"}, {"West Virginia", "Charleston"},
            {"Wisconsin", "Madison"}, {"Wyoming", "Cheyenne"}
        };
        
        Scanner input = new Scanner(System.in); //Declare and Initialize our Scanner object "input"
        int correctCount = 0; //Declare and Initialize our counter variable which will track how many answers the user got correct
        
        //The for loop iterates through each state index, stopping the iteration once the last state index has been accessed
        for (int i = 0; i < statesAndCapitals.length; i++) {
            
            System.out.print("What is the capital of " + statesAndCapitals[i][0] + "? "); //the user is prompted to enter in the capital for each state
            String userAns = input.nextLine(); //the scanner object is invoked to take in the next input from the user as an answer to the previous prompt
            
            /*conditional if-else statement to compare the user's input with the appropriate state capital index
            both the user's input and the state capital are converted to upper case so case sensitivity on the user's input should not matter.*/
            if  (userAns.equalsIgnoreCase(statesAndCapitals[i][1])) {
                System.out.println("Your answer is correct"); //the user is given feedback that they have answered correctly
                correctCount++; //if the user input is equal to the state capital, our correct answer counter is increased by 1
            } else {
                //if the user input doesn't match the correct state capital, the user is given what the answer should have been
                System.out.println("The correct answer should be " + statesAndCapitals[i][1]);
            }           
        } //loop ends once all states have been cycled through
        
        input.close(); //Close our Scanner item to prevent resource leak
        
        System.out.println("You correctly answered " + correctCount + " state capitals"); //prints the total number of correct answers the user input into the program
    }
}