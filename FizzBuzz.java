import java.util.Scanner;

public class FizzBuzz {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = sc.nextInt();

        if(number % 5 == 0){
            if(number % 3 == 0)
                System.out.print("FizzBuzz");
            else
                System.out.print("Fizz");
        }
        else if(number % 3 == 0){
            System.out.print("Buzz");
        }
        else 
            System.out.print(number);
    }
}