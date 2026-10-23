import java.util.Scanner;
import java.util.InputMismatchException;
class ExceptionHandling2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elemnts: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
    try{
        System.out.print("Enter the elements: ");
        for(int i = 0; i < arr.length; i++){
             int element = sc.nextInt();
             arr[i] = element;
        }
       for(int i = 0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
        }

    catch(InputMismatchException e){
        System.out.println("You entered bad data!");
    }        
    }
}