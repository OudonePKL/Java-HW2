import java.util.Scanner;

//  Print a nuber as input and if the number is negative, write a minus on the second line

//  @author: Oudone PKL

public class CheckNum {
    
    // Method for check number
    public static void checkNumber(int num){

        String result;
    
        if(num < 0) {
            result = "Minus";
        } else if ( num > 0) {
            result = "Plus";
        }
         else {
            result = "Zero";
        }
        // Dispaly to screen
        System.out.println("Result: " + num);
        System.out.println(result);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int num = sc.nextInt();

        // call the method
        checkNumber(num);
    }
}
