import java.io.*;
import java.util.Scanner;

class Program1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner checkInput = new Scanner(System.in);

        boolean runWhile = true;

        while (runWhile == true) {
            System.out.println("What program you wanna run \n \"*Please type the number for the selction*\" ");
            System.out.println("---------------------------");
            System.out.println("[0] To quit");
            System.out.println("[1] Problem 1");
            System.out.println("[2] Problem 2: ");
            System.out.print("[3] Problem 3: ");

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
                    break;

                case 2:
                    Problem2();
                    runWhile = false;
                    break;

                case 3:
                    Problem3();
                    runWhile = false;
                    break;

                

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

    public static void Problem2() {
        try (PrintStream writer = new PrintStream(new FileOutputStream("./TxtFile/student.dat"))) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of student records: ");
            int numStudents = input.nextInt();
            input.nextLine(); // Consume the newline character

            for (int i = 0; i < numStudents; i++) {
                System.out.print("Enter student's full name: ");
                String fullName = input.nextLine();
                System.out.print("Enter student's letter grade: ");
                String grade = input.nextLine();
                System.out.print("Enter the year the course was taken: ");
                String year = input.nextLine();

            

                writer.println(fullName + " " + grade + " " + year);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    

    public static void Problem3() throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("./TxtFile/student.dat"));
        int numStudents = 0;

        while (scanner.hasNextLine()) {
            scanner.nextLine();
            numStudents++;
        }

        scanner.close();
        scanner = new Scanner(new File("./TxtFile/student.dat"));

        String[] fullNames = new String[numStudents];
        String[] grades = new String[numStudents];
        String[] years = new String[numStudents];

        int i = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] studentData = line.split(" ", 3);
            fullNames[i] = studentData[0];
            grades[i] = studentData[1];
            years[i] = studentData[2];
            i++;
        }

        if (numStudents == 0) {
            System.out.println("No student records found.");
        } else {
            System.out.println("Student Full Names:");
            for (int j = 0; j < numStudents; j++) {
                System.out.println((j + 1) + ". " + fullNames[j]);
            }

            Scanner input = new Scanner(System.in);
            while (true) {
                System.out.print("Enter the student number to view the record (0 to exit): ");
                int choice = input.nextInt();
                input.nextLine(); // Consume the newline character

                if (choice == 0) {
                    break;
                }

                if (choice >= 1 && choice <= numStudents) {
                    System.out.println("Student Record:");
                    System.out.println("Full Name: " + fullNames[choice - 1]);
                    System.out.println("Letter Grade: " + grades[choice - 1]);
                    System.out.println("Year: " + years[choice - 1]);
                } else {
                    System.out.println("Invalid student number. Please try again.");
                }
            }
        }
    }

}