import java.util.Scanner;
public class BMICalculator {
    public static void main (String[] args){
        System.out.println("\"WELCOME TO BMI CALCULATOR\"");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weigth (kilogram): ");
        double weigth = sc.nextDouble();
        System.out.print("Enter heigth (meter): ");
        double heigth = sc.nextDouble();

        double bmi = weigth/(heigth*heigth);
        System.out.printf("Your BMI is: %.2f\n", bmi);

        if(bmi < 18.5){
            System.out.println("You are underweight.");
        }
        else if(bmi < 25){
            System.out.println("You have a normal weight.");
        }
        else if(bmi < 30){
            System.out.println("You are overweight.");
        }
        else{
            System.out.println("You are obese.");
        }
    }
}
