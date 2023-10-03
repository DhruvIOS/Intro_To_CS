
//Importing required modules
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Program1 {
    public static void main(String[] args) {
        Scanner checkInput = new Scanner(System.in);

        boolean runWhile = true;

        while (runWhile == true) {
            System.out.println("What program you wanna run \n \"*Please type the number for the selction*\" ");
            System.out.println("---------------------------");
            System.out.println("[0] To quit");
            System.out.println("[1] = Temp");
            System.out.println("[2] = Grades ");
            System.out.println("[3] = Multiple loops");
            System.out.print("[4] = Random City loops: ");




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
                    tempMethod();
                    runWhile = false;
                case 2:
                    grades();
                    runWhile = false;

                case 3:
                    loops();
                    runWhile = false;
                case 4:
                    randomCity();
                    runWhile = false;

            }
        }
        checkInput.close();

    }

    public static void tempMethod() {

        Scanner checkInput = new Scanner(System.in);

        int totalBelowFrizing = 0;
        int totalAboveFrizing = 0;

        double totalTemp = 0;

        double total = 0;

        // boolean runWhile = true;

        while (true) {
            System.out.println("Please enter your temperature *In Celsius*");
            System.out.println("---------------------------");

            if (!checkInput.hasNextInt()) {
                System.out.println("Plese enter a valid temp");
                System.exit(0);

            }

            int tempInput = checkInput.nextInt();

            if (tempInput <= 0) {

                System.out.println("The " + tempInput + " is below frizing");

                totalBelowFrizing++;
                totalTemp += tempInput;
                total++;
                System.out.println("The total numbers of below frizing temp you entered is " + totalBelowFrizing);
                System.out.println("The average is " + totalTemp / total);

                System.out.println("Do you wanna continuie? ");

            }

            if (tempInput > 0) {
                System.out.println("The " + tempInput + " is above frizing");

                totalAboveFrizing++;
                totalTemp += tempInput;
                total++;

                System.out.println("The total numbers of above frizing temp you entered is " + totalAboveFrizing);
                System.out.println("The average is " + totalTemp / total);

                System.out.println("Do you wanna continuie?\n Type ** 111 ** to continue ** 222 ** to quite ");
                System.out.print(" ** 222 ** will take you to the menu: ");

                int yes_no = checkInput.nextInt();

                if (yes_no == 111) {
                    continue;
                } else if (yes_no == 222) {
                    main(null);
                }

            }

            checkInput.close();
        }

    }

    public static void grades() {
        Scanner checkInput = new Scanner(System.in);

        boolean runWhile = true;

        int totalA = 0;
        int totalB = 0;
        int totalC = 0;
        int totalD = 0;
        int totalF = 0;

        while (runWhile == true) {
            System.out.println("Type 101 to quit");
            System.out.print("Please enter how any ever grades you would like: ");


            if (!checkInput.hasNextInt()) {
                System.out.println("Please input a valid number between 0 and 100");
            }

            int grades = checkInput.nextInt();

            if(grades < 0 || grades > 101){
                System.out.println("Please input a valid number between 0 and 100");
            }

            if(grades >= 90 && grades <= 100){
                totalA++;
            }else if(grades < 90 && grades >= 80){
                totalB++;
            }else if(grades < 80 && grades >= 70){
                totalC++;
            }else if(grades < 70 && grades >= 60){
                totalD++;
            }else if(grades < 60){
                totalF++;
            }

            if(grades == 101){
                System.out.println(" ");
                System.out.printf("%-10s %-4s\n", "Letter", "Count");

                System.out.printf("%-10s %-5s\n", "Total A's", totalA);
                System.out.printf("%-10s %-5s\n", "Total B's", totalB);
                System.out.printf("%-10s %-5s\n", "Total C's", totalC);
                System.out.printf("%-10s %-5s\n", "Total D's", totalD);
                System.out.printf("%-10s %-5s\n", "Total F's", totalF);

                main(null);

            }




            


        }

        checkInput.close();

    }

    public static void loops(){
        int counted = 0;
        Scanner checkInput = new Scanner(System.in);
        for(int i = 1; i <= 10; i++){
            System.out.println(i + " ");
        }

        int i = 10;

        do{
            System.out.println(i + " ");
            i--;

        }while(i > 0);

        for (int k = 2; k <= 20; k += 2) {
            System.out.println(k);
          }
        

        while(true){
            
            System.out.println("Hello");

            System.out.print("Do you wanna repeat? ");

            String input = checkInput.nextLine();

            if(input.equals("yes") || input.startsWith("y")){
                counted++;
                continue;   
            }else if(input.equals("no") || input.startsWith("n")){
                System.out.println("You repeated the statement "+ counted + " times");
                break;
            }

        }


        for(char letters = 'A'; letters <= 'Z'; letters++){
            System.out.print(letters + " ");
            main(null);
        }

        checkInput.close();


    }

    public static void randomCity(){
        Scanner checkInput = new Scanner(System.in);

        int count = 1;
        String[] citys = new String[5];

        for(int i = 0; i < citys.length; i++){
            System.out.print("Enter city number " + count + ": " );

            String input = checkInput.nextLine();

            citys[i] = input;
            count++;
        }

        Random rand = new Random();
        
        int[] randNum = new int[3];

        for(int i = 0; i < randNum.length; i++){

            int randomNumber = rand.nextInt(5);

            for(int s : randNum){
                if(randomNumber != s){
                    randNum[i] = randomNumber;
                }
            }
        }

        System.out.println("The first city is " + citys[randNum[0]]);
        System.out.println("The second city is " + citys[randNum[1]]);
        System.out.println("The third city is " + citys[randNum[2]]);


        
  









        

    }
}