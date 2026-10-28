// public class binary {
//     public static void main(String[] args) {
//         int num=100;
//         String Octal="";
//         while(num>0){
//             int rem= num%8;
//             Octal = rem + Octal;
//             num= num /8;
//         }
// System.out.println("Octal=" +Octal);
        
//     }
    
// }
// import java.util.Scanner;
// class Student{
//     int rollNo;
//     Student(int r){
//         rollNo=r;
//     }
// }
// public class binary{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter roll number: ");
//         int r = sc.nextInt();
//         Student s1 = new Student(r);
//         System.out.println("Roll Number is: " + s1.rollNo);
//     }
// }

// import java.util.Scanner;
// public class binary{
//     static class Car{
//         public int speed;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter speed: ");
//         int s = sc.nextInt();
//         Car c = new Car();
//         c.speed = s;
//         System.out.println("Speed is: " + c.speed);
//     }
// }
import java.util.Scanner;
public class binary{
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