import java.util.Scanner;

public class index {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.print("Enter size: ");
 int n = sc.nextInt();

 int[] arr = new int[n];

 System.out.println("Enter " + n + " elements:");
 for(int i = 0; i < n; i++){
 arr[i] = sc.nextInt();
 }

 System.out.println("Array elements are:");
 for(int i = 0; i < n; i++){
 System.out.print(arr[i] + " ");
 }
System.out.println();
 int d= sc.nextInt();
 int index= -1;
 for(int i =0;i<n ; i++){
    if(arr[i]==d){
        index= i;
        break;

    }
 }
System.out.println(index);
}
}