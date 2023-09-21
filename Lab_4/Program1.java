
//Importing scanner

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        // Decalring variables
        int records = 2;

        int questionAsked = 0;

        Scanner checkInput = new Scanner(System.in);

        System.out.print("Please enter how many student records you want between \"1-5\": ");
        if (!checkInput.hasNextInt()) {
            System.out.println("Please enter a vaild number between \"1-5\" ");
            System.exit(0);
        }

        records = checkInput.nextInt();

        if (records <= 0 || records > 5) {
            System.out.println("Please enter a vaild number between \"1-5\" ");
            System.exit(0);
        }

        String[] studentName = new String[records];

        String[] letterGrade = new String[records];

        System.out.println("Please enter the 1st student First name and letter grade");
        System.out.print("For example \"Elon A\" : ");

        String FirstStudentNameInput = checkInput.next().toLowerCase();

        String FirstStudentLetterInput = checkInput.next().toLowerCase();

        studentName[0] = FirstStudentNameInput;
        letterGrade[0] = FirstStudentLetterInput;
        questionAsked++;

        if (questionAsked != records) {

            System.out.println("Please enter the 2nd student First name and letter grade");
            System.out.print("For example \"Elon A\" : ");
            String SecondStudentNameInput = checkInput.next().toLowerCase();

            String SecondStudentLetterInput = checkInput.next().toLowerCase();

            studentName[1] = SecondStudentNameInput;
            letterGrade[1] = SecondStudentLetterInput;
            questionAsked++;

        }

        if (questionAsked != records) {

            System.out.println("Please enter the 2nd student First name and letter grade");
            System.out.print("For example \"Elon A\" : ");
            String ThirdStudentNameInput = checkInput.next().toLowerCase();

            String ThirdStudentLetterInput = checkInput.next().toLowerCase();

            studentName[2] = ThirdStudentNameInput;
            letterGrade[2] = ThirdStudentLetterInput;
            questionAsked++;

        }

        if (questionAsked != records) {

            System.out.println("Please enter the 2nd student First name and letter grade");
            System.out.print("For example \"Elon A\" : ");
            String FourStudentNameInput = checkInput.next().toLowerCase();

            String FourStudentLetterInput = checkInput.next().toLowerCase();

            studentName[3] = FourStudentNameInput;
            letterGrade[3] = FourStudentLetterInput;
            questionAsked++;

        }

        if (questionAsked != records) {

            System.out.println("Please enter the 2nd student First name and letter grade");
            System.out.print("For example \"Elon A\" : ");
            String FiveStudentNameInput = checkInput.next();

            String FiveStudentLetterInput = checkInput.next();

            studentName[4] = FiveStudentNameInput;
            letterGrade[4] = FiveStudentLetterInput;
            questionAsked++;

        }



        System.out.println(" ");
        System.out.printf("%-10s %-4s\n", "Name", "Grade");
        System.out.println("---------------------");
        for (int i = 0; i < studentName.length; i++) {
            String name = studentName[i];
            String letter = letterGrade[i];

            // Print data as a table row
            System.out.printf("%-10s %-4s\n", name, letter);
        }
        

        checkInput.close();

    }
}