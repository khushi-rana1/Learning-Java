import java.util.Scanner;

public class ExceptionHandling6{

    public static double CaluculateSquareRoot(double n) throws Exception{
        if(n<0){
            throw new Exception("Number cannot be negative");
        }
        else{
           return Math.sqrt(n);
        }
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try{
            double n = sc.nextDouble();
            double result = CaluculateSquareRoot(n);
            System.out.println("Result: " +result);
        }
        catch(Exception e){
            System.out.print("Enter a positive number");
        }
    }
}
