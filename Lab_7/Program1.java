import java.io.*;
import java.util.Scanner;
import java.io.IOException;

class Program1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner checkInput = new Scanner(System.in);

        boolean runWhile = true;

        while (runWhile == true) {
            System.out.println("What program you wanna run \n \"*Please type the number for the selction*\" ");
            System.out.println("---------------------------");
            System.out.println("[0] To quit");
            System.out.println("[1] Problem 1");
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
                    Problem1();
                    runWhile = false;

            }

        }
    }

    public static void Problem1() throws FileNotFoundException, IOException {

        Scanner inputFile = new Scanner(new File("./TxtFile/input.txt"));
        FileWriter outputFile = new FileWriter("./TxtFile/output.txt");

        int fileLength = 0;
        double big = 0;
        double sum = 0;
        while (inputFile.hasNextInt()) {
            int num = inputFile.nextInt();

            sum += num;

            if (num > big)
                big = num;

            fileLength++;

        }

        // System.out.println("The Biggest number is " + big);
        // System.out.println("The sum is " + sum);
        // System.out.println("The average number is " + sum / fileLength);
        double average = sum / fileLength;

        try {
            outputFile.write("The Biggest number is " + big + "\n");
            outputFile.write("The sum is " + sum + "\n");
            outputFile.write("The average number is  " + average);


            outputFile.close();

            System.out.println("Completed");

            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}