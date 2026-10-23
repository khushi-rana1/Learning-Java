// Exception Handling with multiple catch blocks
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two numbers: ");

    try{
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a/b);
        System.out.println("Result: " + c);
    }
    catch(ArithmeticException e){
        System.out.println("Arithmetic Exception");
    }
    catch(InputMismatchException e){
        System.out.println("Enter only whole numbers");
    }
    catch(Exception ex){
        System.out.println("Parent Exception");
    }
}
}
