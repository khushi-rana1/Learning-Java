//find maximum element in an array
import java.util.Scanner;
public class ArrayMax {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of elements:");
    int n = sc.nextInt();

    if(n <= 0){
        System.out.print("Array is empty!");
    }else{
       System.out.print("Enter the elements:");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
             arr[i] = sc.nextInt();
        }
    int max = arr[0];
    for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print("Maximum element in the array is:" + max);
    }   
 }
} 

