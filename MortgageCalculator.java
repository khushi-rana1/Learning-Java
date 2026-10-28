import java.util.Scanner;
import java.lang.Math;

public class MortgageCalculator {
    public static void main (String[] args) {
    final byte MONTH = 12;
    final byte PERCENTAGE = 100;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Input Principal Amount: ");
    int principal = sc.nextInt();
    

    System.out.print("Input Annual Intrest: ");
    float annualintrest = sc.nextFloat();
    float monthlyintrest = annualintrest / PERCENTAGE /  MONTH;

    System.out.print("Input Period(Year): ");
    byte period = sc.nextByte();
    int noOfPayments = period *  MONTH;

    double mortgage = principal * (monthlyintrest * Math.pow(1 + monthlyintrest, noOfPayments)) / (Math.pow(1 + monthlyintrest, noOfPayments) - 1);

    System.out.println("Mortgage: " + mortgage);
    }
}
