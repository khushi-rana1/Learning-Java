import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

    public static String get_user_choice(){
        Scanner sc = new Scanner(System.in);
        String userChoice = "";
        System.out.println("Welcome to Rock Paper Scissors Game!!");
        System.out.println("Enter 'exit' to quit the game.");

            while(true){
            System.out.print("Enter your choice (rock, paper, scissors): ");
            userChoice = sc.next().toLowerCase();

            if(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors") ||  userChoice.equals("exit")){
            return userChoice;
            }
            
            else{
                System.out.println("Enter correct option!!");
            }
        }
    }

    public static String get_computer_choice(){
        String[] choice = {"rock", "paper", "scissors"};
        int arraySize = choice.length;
        Random random = new Random();
        int index = random.nextInt(choice.length);
        System.out.println("Computer choice: " + choice[index]);
        return choice[index];
    }

    public static int determine_winner(String userChoice, String computerChoice){
        if(userChoice.equals(computerChoice)){
            System.out.println("It's a tie!");
            return 0;
        }
        else if(userChoice.equals("rock") && computerChoice.equals("scissors") || userChoice.equals("paper") && computerChoice.equals("rock") || userChoice.equals("scissors") && computerChoice.equals("paper")){
            System.out.println("You win!");
            return 1;
        }
        else{
            System.out.println("Computer wins!");
            return -1;
        }
    }
    public static void main (String[] args){
       int userScore = 0;
       int computerScore = 0;
       
       for(int i = 0; i < 3; i ++){
        System.out.println("\n========== ROUND " + i + " ==========");
        String userChoice = get_user_choice();
        if(userChoice.equals("exit")){
                System.out.println("Exiting the game. Goodbye!");
                break;
            }
        String computerChoice = get_computer_choice();
        determine_winner(userChoice, computerChoice);

        int result = determine_winner(userChoice, computerChoice);
        if(result == 1){
            userScore++;
        }
        else if(result == -1){
            computerScore++;
        }
        System.out.println("User Score = " +userScore);
        System.out.println("Computer Score = " +computerScore);
       }

        System.out.println("\n========== FINAL RESULT ==========");
        System.out.println("User Score: " + userScore);
        System.out.println("Computer Score: " + computerScore);
        if (userScore > computerScore) {
             System.out.println("Congratulations! You are the overall winner!");
        }
        else if (computerScore > userScore) {
             System.out.println("Computer is the overall winner!");
         }
        else {
            System.out.println("The game is a DRAW!");
         }
         System.out.println("\nThank you for playing!");
    }
}

