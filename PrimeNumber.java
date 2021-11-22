import java.util.Scanner;

// Prime number program

// @author: Oudone PKL

public class PrimeNumber {
    
    // Method for checck prime number
    static void checkPrimeNumber(int num) {
        int i,m,flag = 0;

        m = num / 2;

        if(num == 0 || num == 1) {
            System.out.println(num + " is not prime number");
        } else {
            for(i = 2; i <= m; i++) {
                if(num % i == 0) {
                    System.out.println(num + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {System.out.println(num + " is prime number");}
        }
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int num = sc.nextInt();

        // call the function
        checkPrimeNumber(num);
    }
}
