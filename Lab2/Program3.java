//Importing scanner
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args){

        //creating a list to store the user input
        double[] prices = new double[5];

        //Declaring a subTotal var that is getting the value of 0
        double subTotal = 0;
        
        //Declaring a salesTax var that is getting the value of .06
        double salesTax = .06;

        //Decalring the scanner 
        Scanner checkInput = new Scanner(System.in);

        //To display what question number is beig asked
        int questionNum = 1;

        //Created a for loop to ask the question 5 times
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the price for item " + questionNum +": " );
            prices[i] = checkInput.nextDouble();
            questionNum = questionNum +1;
        }


        //Createad a for loop for add all the itme prices from the list
        for (int i = 0; i < prices.length; i++) {
            subTotal += prices[i];
        }

        //Calcuting the tax
        double toalTax = subTotal * salesTax;

        //Calcuting the total price
        double total = subTotal + toalTax;


        //Displaying the information
        System.out.println("Sub Total: " + subTotal);
        System.out.println("+ Sales Tax: " + toalTax);
        System.out.println("Total: " + total);

        //Closing the scanner
        checkInput.close();


    }
}
