import java.util.Scanner;
public class CheckSortArray {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.print("Input number of elements: ");
 int n = sc.nextInt();

System.out.print("Input array elements: ");
 int[] arr = new int[n];
 for(int i = 0; i < n; i++){
 arr[i] = sc.nextInt();
 }

boolean flag= true;
for(int i=1;i<arr.length; i++){
    if(arr[i]< arr[i-1]){
        flag= false;
        break;
    }
}
    if(flag== true){
        System.out.println("Elements are sorted");
    }
    else{
        System.out.println("Elements are not sorted");
    }
}
}
