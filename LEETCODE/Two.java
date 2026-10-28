//You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
import java.util.Scanner;
public class Two {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();

 int[] nums = new int[n];
 for(int i = 0; i < n; i++){
 nums[i] = sc.nextInt();
 }
 int target = sc.nextInt();
 for(int i = 0; i<n; i++){
    for(int j = i+1; j<n; j++){
        if(nums[i] + nums[j] == target){
            System.out.println(i + " " + j);
            break;
        }
    }
 }

 }
}
    
