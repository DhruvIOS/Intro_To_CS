//Importing the scanner
import java.util.Scanner;

public class Program1{
    public static void main(String[] args){

        //Decalring the scanner 
        Scanner checkInput = new Scanner(System.in);


        //Prompting the user for the price input
        System.out.print("Enter your item price: ");
        
        //Checking the line for input
        double itemPrice = checkInput.nextDouble();


        //Prompting the user for the sales tax input
        System.out.print("Enter your sales tax: ");
        
        //Checking the line for input
        double salesTax = checkInput.nextDouble();


        //Multiplying sales tax and price tax
        double total = salesTax * itemPrice;



        //Outputing
        System.out.println("Item price: " + itemPrice);
        System.out.println("+ Sales Tax: " + salesTax);
        System.out.println("Total: " + total);
        

        //closing the scanner
        checkInput.close();
        

    }
}