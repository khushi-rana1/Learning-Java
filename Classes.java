// input two numbers print their sum, multiplication and sum of their squares
import java.util.Scanner;

class cls1{
    void add(int a, int b){
        System.out.println("Sum = " +(a+b));
    }
}
class cls2 extends cls1{
    void multi(int a, int b){
        System.out.println("Multiplication = " +(a*b));
    }
    void sumsquare(int a, int b){
        System.out.println("Sum of their squares = " +((a*a)+(b*b)));
    }
}
public class Classes {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    cls2 obj = new cls2();
    System.out.print("Enter first number: ");
    int a = sc.nextInt();
    System.out.print("Enter second number: ");
    int b = sc.nextInt();
    obj.add(a,b);
    obj.multi(a,b);
    obj.sumsquare(a,b);
    }
}
