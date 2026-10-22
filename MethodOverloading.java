import java.util.Scanner;
public class MethodOverloading {
    static class Calculator{
        public int add(int a, int b){
            return a + b;
        }
        private int add(int a, int b, int c){
            return a + b + c;
        }
        public void PrintThreeSum(int x, int y, int z){
            System.out.println("Sum of three numbers: " + add(x, y, z));
        }
    }
        
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print("Enter three numbers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            Calculator c1 = new Calculator();
            System.out.println("Sum of two numbers: " + c1.add(a, b));
            c1. PrintThreeSum(x, y, z);


        }
    
}
