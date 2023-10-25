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
            System.out.print("[2] Input Validate: ");
            



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

                case 2:

                    Scanner userInput2 = new Scanner(System.in);
                   
                    String age = Method1(userInput2, "What is your age? ");
                    System.out.println("Your name is " + age);
                    
                    runWhile = false;



            }
        }

    }



    public static String Method1(Scanner checkInput, String prompt){

        System.out.print(prompt);

        String output = checkInput.nextLine();

        return output;
        

    }



    public static int inputValidate(Scanner checkInput, String prompt){

        

        System.out.print(prompt);

        while(!checkInput.hasNextInt()){
            System.out.println("Please input a valid number");
        }

        int age = checkInput.nextInt();

        if(age <= 0 || age > 100){
            System.out.println("Please enter a age higher than 0 and less than 0");
        }


        return age;


       
    }
}


    
