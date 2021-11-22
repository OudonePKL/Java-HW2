import java.util.Scanner;

// Check your weight program

//  @author: Oudone PKL

public class CheckWeight {

    // Method for check weight
    public static void checkWeight(int weight, int height) {
        weight = weight + 100 - height;
        System.out.println(weight);

        if(weight > 0) {
            System.out.println("You are obese.");
        }
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        int weight = sc.nextInt();

        System.out.print("Enter your height: ");
        int height = sc.nextInt();

        // call the method
        checkWeight(weight, height);
    }
}
