// count number of digits in a number

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int count = 0;
        do{
            n = n/10;
            count++; 
        }while(n!= 0);
        System.out.println("Number of digits: " +count);
    }
}
