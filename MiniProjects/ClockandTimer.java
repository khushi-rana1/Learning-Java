import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClockandTimer {
    public static void main(String[]args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        byte choice = 0;
        boolean keepLooping = true;

        while(keepLooping){
        try{
        System.out.println("Enter 1 to display Digital Clock");
        System.out.println("Enter 2 to display Countdown Timer");
        System.out.print("Enter your choice(1/2): ");
        choice = sc.nextByte();

        if(choice == 1 || choice == 2){
             keepLooping = false;
        } else{
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }
        } catch(InputMismatchException e){
             System.out.println("Invalid input! Please enter a valid number.");
             sc.nextLine();
             continue;
             }
        }
        
        if(choice == 1){
         while (true) {
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
            String formattedTime = currentTime.format(formatter);
            System.out.print("\rCurrent Time: " + formattedTime);       
            Thread.sleep(1000);
        }
        }
        
        else{
            try{
            System.out.print("Enter countdown time in seconds:");
            int countdownTime = sc.nextInt();
            
                for(int i = countdownTime; i >= 0; i--){
                System.out.print("\rCountdown: " + i + " seconds remaining");
                Thread.sleep(1000);
                }
            System.out.println("\nTime's up!");
            } catch(InputMismatchException e){
                System.out.println("Invalid input! Please enter a valid number.");
                sc.nextLine();
            }
        }
    }
}
