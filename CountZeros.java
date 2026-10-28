
import java.util.Scanner;
public class CountZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int zeroCount = 0;

        // Handle case when number is 0 itself
        if (number == 0) {
            zeroCount = 1;
        } else {
            // Convert number to string and count zeros
            String numStr = Long.toString(number);
            for (int i = 0; i < numStr.length(); i++) {
                if (numStr.charAt(i) == '0') {
                    zeroCount++;
                }
            }
        }

        System.out.println("Number of zeros: " + zeroCount);
        scanner.close();
    }
}

    

