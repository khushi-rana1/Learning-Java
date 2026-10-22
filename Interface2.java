// find GCD of two numbers using interface
import java.util.Scanner;
interface GCD{
    int findGCD(int num1, int num2);
}
class A implements GCD{
    public int findGCD(int num1, int num2){
        if(num1 == 0 && num2 == 0){
            return 0;
        }
        else if( num1 == 0){
            return num2;
     }
        else if (num2 == 0){
            return num1;
        }
        else{
            int gcd = 1;
            for(int i = 1; i <= num1 && i <= num2; i++){
                if(num1 % i == 0 && num2 % i == 0){
                    gcd = i;
                }
            }
             return gcd;
        }
    }
}

public class Interface2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter second number: ");
    int num2 = sc.nextInt();
    A obj = new A();
    System.out.println("GCD of " + num1 + " and " + num2 + " is: " + obj.findGCD(num1, num2));
    }
}
