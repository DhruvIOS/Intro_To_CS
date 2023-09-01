//Importing Scanner for input 
import java.util.Scanner;


public class Program2 {
    public static void main(String[] args){
        //Decalring the scanner 
        Scanner checkInput = new Scanner(System.in);

        //Asking for the name prompt
        System.out.print("What is your name: ");

        //Checking the line for input
        String nameInput = checkInput.nextLine();


        //Outputing
        System.out.println("Hello " + nameInput + " We hope you have a nice day!");

        //Closing the scanner
        checkInput.close();

    }
}
