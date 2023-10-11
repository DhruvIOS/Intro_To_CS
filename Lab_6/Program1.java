
//Importing required modules
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner checkInput = new Scanner(System.in);

        boolean runWhile = true;

        while (runWhile == true) {
            System.out.println("What program you wanna run \n \"*Please type the number for the selction*\" ");
            System.out.println("---------------------------");
            System.out.println("[0] To quit");
            System.out.println("[1] Calulator");
            System.out.print("[2] Number pattern: ");

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
                    cal();
                    runWhile = false;
                case 2:
                    numbers();
                    runWhile = false;

            }
        }

    }

    public static void cal() {

        boolean runWhile = true;

        Scanner checkInput = new Scanner(System.in);

        while (runWhile == true) {
            System.out.print(
                    "Please enter your expression in the fllowing format \" 1 + 1\" ");

            String firstNumber = checkInput.next();

            String operator = checkInput.next();

            String secondNumber = checkInput.next();

            double num1 = 0.0;

            double num2 = 0.0;

            boolean isValidDouble = true;

            try {
                num1 = Double.parseDouble(firstNumber);
                num2 = Double.parseDouble(secondNumber);


                // You can now use 'value' as a double
            } catch (NumberFormatException e) {
                isValidDouble = false;
            }

            if(!isValidDouble){
                System.out.println("no");
            }

            

            if (isValidDouble) {
                if (operator.equals("+")) {
                    System.out.println(num1 + num2);

                } else if (operator.equals("-")) {
                    System.out.println(num1 - num2);

                } else if (operator.equals("*")) {
                    System.out.println(num1 * num2);

                } else if (operator.equals("/")) {
                    try {
                        System.out.println(num1 / num2);

                    } catch (ArithmeticException e) {
                        System.out.println("You can't divide by 0");

                    }
                }

            } 

            

        }

    }

    public static void numbers() {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= i + 4; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}