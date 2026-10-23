import java.util.Scanner;
class ExceptionHandling5{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        try{
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int result = (num1/num2);
            System.out.println("Result: " +result);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero");
        }
        finally{
            System.out.println("Program Ended");
        }

    }
}
