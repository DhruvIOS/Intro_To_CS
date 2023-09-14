//Importing the scanner
import java.util.Scanner;
class Program1 {

  public static void main(String[] args) {
    //Decalring the variabls
    int credits;
    double GPA;
    int sem;
    int totalCredits;
    String studentYear;
    String enrollmentStat;
    String goodStanding;
    
    //Decalring the scanner variable
    Scanner checkInput = new Scanner(System.in);

    //Asking the user for the name
    System.out.print("Please enter your name: ");
    String nameInput = checkInput.nextLine();

    
    //Asking the user for the credit
    System.out.print("Please enter your credits: ");


    //Validing the user's input
    if(!checkInput.hasNextInt()){
      System.out.println("Please enter a valid number");
      System.exit(0);
    }

    //Getting the input
    credits = checkInput.nextInt();

    //Asking the user for the credit
    System.out.print("Please enter how many semesters have you taken: ");

    //Validing the user's input
    if(!checkInput.hasNextInt()){
      System.out.println("Please enter a valid number");
      System.exit(0);
    }

    //Getting the input
    sem = checkInput.nextInt();



    //Asking the user for the GPA
    System.out.print("Please enter your GPA: ");

    //Validing the user's input
    if(!checkInput.hasNextDouble()){
      System.out.println("Please enter a valid number");
      System.exit(0);
    }

    //Getting the input
    GPA = checkInput.nextDouble();

    //Calculating total credits
    totalCredits = sem * credits;

    if(totalCredits <= 29.5)
        studentYear = "Freshman";

    else if(totalCredits <= 59.5)
        studentYear = "Sophomore";
    else if(totalCredits <= 89.5)
        studentYear = "Junior";

    else
      studentYear = "Senior";


    switch(credits){
      case 1:
        enrollmentStat = "Less than half-time";
        break;

      case 2:
        enrollmentStat = "Less than half-time";
        break;

      case 3:
        enrollmentStat = "Less than half-time";
        break;

      case 4:
        enrollmentStat = "Less than half-time";
        break;

      case 5:
        enrollmentStat = "Less than half-time";
        break;

      case 6:
        enrollmentStat = "Half-time";
        break;
        
      case 7:
        enrollmentStat = "Half-time";
        break;
        
      case 8:
        enrollmentStat = "Half-time";
        break;

      case 9:
        enrollmentStat = "Three-quarter time";
        break;
        
      case 10:
        enrollmentStat = "Three-quarter time";
        break;

      case 11:
        enrollmentStat = "Three-quarter time";
        break;

      default:
        enrollmentStat = "Full-Time";
        break;

        
    }



    if(GPA >= 1.50 && totalCredits <= 30){
      goodStanding = "Good Standing";
    }else if(GPA >= 1.75 && totalCredits <= 60){
      goodStanding = "Good Standing";

    }else if(GPA >= 2.0 && totalCredits >= 60){
      goodStanding = "Good Standing";

    }else{
      goodStanding = "Bad Standing";
    }




    

    System.out.println("////////////////* "+ nameInput + " *\\\\\\\\\\\\\\\\");
    System.out.println("///////////* Student Details *\\\\\\\\\\");
    

    System.out.println("You are a "+ studentYear);
    System.out.println("You are a "+ enrollmentStat + " Student");
    System.out.println("You are in "+ goodStanding);
    
    
   
      
      
    checkInput.close();
    




    
  }
}