//Division by zero
import java.util.Scanner;
public class ExceptionHandling1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    try{
        System.out.print("Input first number: ");
        int a = sc.nextInt();
        System.out.print("Input second number: ");
        int b = sc.nextInt();
        System.out.println("Division: " + (a/b));
    }
    catch(ArithmeticException e){
        System.out.println("Divvison by zero not allowed!!");
    }

 }   
}
