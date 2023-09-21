import java.util.Arrays;
import java.util.Scanner;

public class Program2 {
    
    public static void main(String[] args){

        boolean gameLive = true;

        int[] nums = {0, 1,2,3};

        String[] row1 = {"1", "-", "-", "-"};
        String[] row2 = {"2", "-", "-", "-"};
        String[] row3 = {"3", "-", "-", "-"};

    

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(row1));
        System.out.println(Arrays.toString(row2));
        System.out.println(Arrays.toString(row3));


        Scanner checkInput = new Scanner(System.in);

        while(gameLive == true){
            System.out.print("Please select a space from Up to Down ");

            int UD = checkInput.nextInt();

            System.out.print("Please select a space from Left to Right ");

            int LR = checkInput.nextInt();



            if(UD == 1){
                row1[LR] = "x";

            }

            if(UD == 2){
                row2[LR] = "x";

            }

            if(UD == 3){
                row3[LR] = "x";

            }

            System.out.println(Arrays.toString(nums));
            System.out.println(Arrays.toString(row1));
            System.out.println(Arrays.toString(row2));
            System.out.println(Arrays.toString(row3));





        }

        checkInput.close();





    }
}
