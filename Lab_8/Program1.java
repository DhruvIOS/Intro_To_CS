
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
            System.out.println("[3] Min and Max Method: ");
            System.out.println("[4] Double Input validate: ");
            System.out.println("[5] Double Min and Max: ");
            System.out.println("[6] Madlib: ");

            if (!checkInput.hasNextInt()) {
                System.out.println("Please enter a vaild number between \"1-4\" ");
                System.exit(0);

            }

            int selction = checkInput.nextInt();
            checkInput.nextLine();

            if (selction > 6 || selction < 0) {
                System.out.println("Please enter a vaild number between \"1-4\" ");
            }

            switch (selction) {
                case 0:
                    System.out.println("Good Bye");
                    runWhile = false;
                    break;
                case 1:

                    Scanner userInput = new Scanner(System.in);
                    String output = Name(userInput, "What is your name? ");
                    System.out.println("Your name is " + output);
                    runWhile = false;
                    break;

                case 2:

                    Scanner userInput2 = new Scanner(System.in);

                    int outputAge = inputValidate(checkInput, "Please enter an number: ");
                    System.out.println("You entered " + outputAge);

                    runWhile = false;
                    break;

                case 3:

                    Scanner userInput3 = new Scanner(System.in);

                    int userOutput = minMax(checkInput, 1, 10, "Please follow the instruction ");
                    System.out.println("Your value is " + userOutput);

                    runWhile = false;
                    break;

                case 4:
                    Scanner userInput4 = new Scanner(System.in);

                    double userOutput4 = DoubleInputValidate(checkInput, "Please input a double: ");
                    System.out.println("Your value is " + userOutput4);

                    runWhile = false;
                    break;

                case 5:
                    Scanner userInput5 = new Scanner(System.in);

                    double userOutput5 = Double_Min_Max(checkInput, 1, 10, "Please follow the instruction: ");
                    System.out.println("Your value is " + userOutput5);

                    runWhile = false;
                    break;

                case 6:

                    MadLib();
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
            checkInput.nextLine();

            runWhile = false;

        }

        return num;

    }

    public static int minMax(Scanner checkInput, int min, int max, String prompt) {

        Scanner minMax_Scanner = new Scanner(System.in);

        boolean runWhile = true;

        int value;

        int returnValue = 0;

        while (runWhile == true) {

            System.out.println(prompt);

            value = inputValidate(minMax_Scanner, "Please enter a number between " + min + " and " + max + ": ");

            if (value < min || value > max) {
                System.out.println("Invalid input");

            } else {

                returnValue = value;
                runWhile = false;



            }

        }

        return returnValue;

    }

    public static double DoubleInputValidate(Scanner checkInput, String prompt) {
        boolean runWhile = true;

        double num = 0;

        while (runWhile == true) {

            System.out.print(prompt);

            while (!checkInput.hasNextDouble()) {
                String something = checkInput.next();
                System.out.print("This is what is in the scanner: " + something + "    where it ends");
                

            }

            if (checkInput.hasNextDouble()) {
                num = checkInput.nextDouble();

                runWhile = false;
            }else{
                System.out.println("DOuble input validate");
                runWhile = false;
                
            }

        }

        return num;
    }

    public static double Double_Min_Max(Scanner checkInput, double min, double max, String prompt) {

        boolean runWhile = true;

        double value;

        double returnValue = 0;

        while (runWhile == true) {

            System.out.println(prompt);

            String prompt2 = "Please enter a number between: " + min + " - " + max + ": ";
            value = DoubleInputValidate(checkInput, prompt2);

            if (value < min || value > max) {
                System.out.println("Invalid input");

            } else {
                returnValue = value;
                runWhile = false;

            }

        }

        return returnValue;

    }

    public static void MadLib() {
        Scanner userInput = new Scanner(System.in);

        String itemName = Name(userInput, "Please enter the name of your item: ");
        String color = Name(userInput, "Please enter the color of your item: ");
        String itemColor = Name(userInput, "Please enter a different color of your item: ");

        int maxNumber = inputValidate(userInput, "Please input the max number of item that someone can have: ");
        int minNumber = inputValidate(userInput, "Please input the min number of item that someone can have: ");

        double maxPrice = DoubleInputValidate(userInput, "Please enter the maximum price of your item: ");
        double minPrice = DoubleInputValidate(userInput, "Please enter the minmum price of your item: ");



        String numbers_itemBuy_prompt = "The System has between " + minNumber + " and " + maxNumber + " numbers of "
                + itemName + " with the color of " + itemColor + ". Please enter how many would u like to buy: ";

        int nums_toBuy = minMax(userInput, minNumber, maxNumber, numbers_itemBuy_prompt);

        String price_for_each_prompt = "The system is selling " + itemName + " between " + minPrice + " and " +maxPrice
                + " please enter how much you willing to pay for one item: ";

        double price = Double_Min_Max(userInput, minPrice, maxPrice, price_for_each_prompt);

        double totalPrice = nums_toBuy * price;

        System.out.println("You brought " + nums_toBuy + " " + itemColor + " color " + itemName + ". Total cost being $"+ totalPrice + " each one costing you $" + price  );

    }

}
