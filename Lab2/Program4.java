//Importing scanner
import java.util.Scanner;


public class Program4 {
    public static void main(String[] args){
    
        //creating a list to store the user input
        int[] scores = new int[3];

        //declaring a var for average score
        int averageScore = 0;

        //Decalring the scanner 
        Scanner checkInput = new Scanner(System.in);

        //To display what question number is beig asked
        int questionNum = 1;


        //Created a for loop to ask the question 3 times
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter your score number " + questionNum +": " );
            scores[i] = checkInput.nextInt();
            questionNum = questionNum +1;
        }

        //Createad a for loop for add all the itme prices from the list
        for (int i = 0; i < scores.length; i++) {
            averageScore += scores[i];
        }

        //Calculating the average
        averageScore = averageScore/3;

        //Outputing the average
        System.out.println("Average: " + averageScore);

        //Closing scanner
        checkInput.close();
        
    }
}
