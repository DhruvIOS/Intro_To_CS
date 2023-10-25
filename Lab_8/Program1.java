import java.util.Scanner;

public class Program1{
    public static void main(String[] args) {

                Scanner checkInput = new Scanner(System.in);

        boolean runWhile = true;

        while (runWhile == true) {
            System.out.println("What program you wanna run \n \"*Please type the number for the selction*\" ");
            System.out.println("---------------------------");
            System.out.println("[0] To quit");
            System.out.println("[1] Method1");



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
                    String output = Method1(userInput, "What is your name? ");
                    System.out.println("Your name is " + output);
                    userInput.close();
                    runWhile = false;


            }
        }

    }



    public static String Method1(Scanner checkInput, String prompt){

        System.out.print(prompt);

        String output = checkInput.nextLine();

        return output;
        

    }



    public static Boolean Method2(){


        return true;
    }
}


    
