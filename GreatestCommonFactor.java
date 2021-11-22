
// Greatest common fector program

// @author: Oudone PKL

public class GreatestCommonFactor {

    // Method for checck greatest common fector
    public static int checkGCF(int num1, int num2) {

        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }

        return num2;
    }

    public static void main(String[] args) {

        // Crate variable
        int num1 = 12, num2 = 18;

        // call method and display to screen
        System.out.println("GCF: " + checkGCF(num1, num2));
    }
}
