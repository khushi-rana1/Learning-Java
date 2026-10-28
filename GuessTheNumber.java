import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class GuessTheNumber{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 to 100");

          while (true){
                try{
                    System.out.print("Guess the number: ");
                    int guessNumber = sc.nextInt();

                    if(guessNumber>100 || guessNumber == 0 ){
                         System.out.println("Please guess the number between 1 to 100.");
                    }
                     else if(randomNumber == guessNumber){
                         System.out.println("Congrats!! You guessed the number!");
                         break;
                    }
                     else if((randomNumber-guessNumber>0 && randomNumber-guessNumber<=10) || (guessNumber-randomNumber>0 && guessNumber-randomNumber<=10)){
                         System.out.println("HOT");
                    }
                    else
                         System.out.println("COLD");
                }

                catch(InputMismatchException e){
                      System.out.println("Invalid input! Please enter a valid number.");
                      sc.next();
                }

            }
    }
}