import java.util.Scanner;
public class PrivateModifier{
    static class Account{
        private int balance;
        public void setBalance(int b){
           balance = b;
        }
        public int getBalance(){
           return balance;
        }
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter balance: ");
    int b = sc.nextInt();
    Account acc = new Account();
    acc.setBalance(b);
    System.out.println("Balance is: " + acc.getBalance());
    }
}

