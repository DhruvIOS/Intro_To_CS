//Importing scanner
import java.util.Scanner;

public class Program5{
    public static void main(String[] args){

        //Declaring the first number var
        int firstNum = 0;


        //Declaring the second number var

        int secondNum = 0;

        //Decalring the scanner 

        Scanner checkInput = new Scanner(System.in);


        //For loop to ask the question twice
        for(int i = 1; i < 3; i++){
            System.out.print("Enter your "+ i + " number: ");



            //if the i is = 1 it will set the firstNum to what ever user inputs first 
            if(i == 1){
                firstNum = checkInput.nextInt();
            }else{
                //if the i is = 2 it will set the firstNum to what ever user inputs second


                secondNum = checkInput.nextInt();


            }

            

        }


       //Outputing the addition
        System.out.println("Sum: "+ (firstNum + secondNum) );

       
        //Outputing the subtraction
        System.out.println("Subtract: "+ (firstNum - secondNum) );

        //Outputing the product
        System.out.println("Product: "+ (firstNum * secondNum) );

        //Outputing the quotient
        System.out.println("Quotient: "+ (firstNum / secondNum) );

        //Outputing the remainder
        System.out.println("Remainder: "+ (firstNum % secondNum) );


        checkInput.close();

    }
}