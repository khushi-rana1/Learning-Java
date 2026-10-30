import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        byte userInput = 0;
    
        while(true){
        try{
        System.out.println("Welcome to Calculator");
        System.out.println("Choose an operation\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Modulo\n6.Exponent\n7.Exit");
        System.out.print("Enter your choice: ");
        userInput = sc.nextByte();
        
        if(userInput < 1 || userInput > 7){
                System.out.println("Enter a number between 1 to 7.");
                continue;
            }
        else if(userInput == 7){
             System.out.println("Goodbye!!");
             break;
        }
        } catch(InputMismatchException e){
             System.out.println("Invalid input! Please enter a valid number.");
             sc.nextLine();
             continue;
        }

        try{
            if(userInput >= 1 && userInput <= 7){
            System.out.print("Input the values: ");
            float a = sc.nextInt();
            float b = sc.nextInt();
                switch(userInput){
                   case 1 : 
                      System.out.println("Addition: " + (a+b));
                      break;
                   case 2 : 
                      System.out.println("Subtraction: " + (a-b));
                      break;
                   case 3 : 
                      System.out.println("Multiplication: " + (a*b));
                      break;
                  case 4 : 
                        if(b ==0){
                            System.out.println("Cannot divide by zero!");
                            } else{
                            System.out.println("Division: " + (a/b));  
                            }
                            break;
                  case 5 :
                        if(b ==0){
                        System.out.println("Cannot divide by zero!");
                        } else{
                        System.out.println("Modulo: " + (a%b));  
                        }
                        break;
                  case 6 : 
                        System.out.println("Exponentiation: " + Math.pow(a,b));
                        break;
                }
            }
        } catch(InputMismatchException e){
            System.out.println("Invalid input! Please enter a valid number.");
            sc.nextLine();
        }
        }
    }
}
        


    

