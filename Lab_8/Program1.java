
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        Scanner checkInput = new Scanner(System.in);

        boolean runWhile = true;

        while (runWhile == true) {
            System.out.println("What program you wanna run \n \"*Please type the number for the selction*\" ");
            System.out.println("---------------------------");
            System.out.println("[0] To quit");
            System.out.println("[1] Method1");
            System.out.println("[2] Input Validate: ");
            System.out.print("[3] Min and Max Method: ");

            if (!checkInput.hasNextInt()) {
                System.out.println("Please enter a vaild number between \"1-4\" ");
                System.exit(0);

            }

            int selction = checkInput.nextInt();

            if (selction > 4 || selction < 0) {
                System.out.println("Please enter a vaild number between \"1-4\" ");
            }

            switch (selction) {
                case 0:
                    System.out.println("Good Bye");
                    runWhile = false;
                case 1:

                    Scanner userInput = new Scanner(System.in);
                    String output = Name(userInput, "What is your name? ");
                    System.out.println("Your name is " + output);
                    userInput.close();
                    runWhile = false;
                    break;

                case 2:

                    Scanner userInput2 = new Scanner(System.in);

                    int outputAge = inputValidate(userInput2, "Please enter an number: ");
                    System.out.println("You entered " + outputAge);
                    userInput2.close();
                    runWhile = false;
                    break;

                case 3:

                    Scanner userInput3 = new Scanner(System.in);

                    int userOutput = minMax(checkInput, 1, 10, "Please follow the instruction ");
                    System.out.println("Your value is "+ userOutput);
                    userInput3.close();
                    runWhile = false;
                    break;



            }
        }

    }

    public static String Name(Scanner userInput, String prompt) {
        System.out.print(prompt);

        String output = userInput.nextLine();

        return output;

    }

    public static int inputValidate(Scanner checkInput, String prompt) {

        boolean runWhile = true;

        int num = 0;



        while (runWhile == true) {

            System.out.print(prompt);

            while (!checkInput.hasNextInt()) {
                System.out.print("Please enter a vaild number: ");

                
                checkInput.nextLine();

            }

            num = checkInput.nextInt();

            runWhile = false;

        }

        return num;

    }

    public static int minMax(Scanner checkInput, int min, int max, String prompt){

        Scanner minMax_Scanner = new Scanner(System.in);

        boolean runWhile = true;

        int value = 0;

        int returnValue = 0;

        while (runWhile == true) {

            System.out.println(prompt);

            value = inputValidate(minMax_Scanner, "Please enter a number between 1 and 10: ");


            if (value < 1|| value > 10) {
                System.out.print("In valid input");

                checkInput.nextLine();

            } else {
                returnValue = value;
                runWhile = false;
                minMax_Scanner.close();

            }

        }

        return returnValue;



    }


}
