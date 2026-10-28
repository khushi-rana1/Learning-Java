// import java.util.Scanner;

// public class Main {
//  public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in);
//  int n = sc.nextInt();

//  int[] arr = new int[n];
//  for(int i = 0; i < n; i++){
//  arr[i] = sc.nextInt();
//  }

//  int max= Integer.MIN_VALUE;
//  int max2 =  0; 
//  for(int i=0; i<arr.length; i++){
//     if(arr[i]> max){
//         max= arr[i];
//     }
//    else if(arr[i]>max && arr[i]!= max){
//        max2= arr[i];
//     }
//  }
 
 
//  System.out.println( max2 );
//  }
// }





// linear search
// import java.util.Scanner;
// public class Main {
//  public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in);
//  int n = sc.nextInt();

//  int[] arr = new int[n];
//  for(int i = 0; i < n; i++){
//  arr[i] = sc.nextInt();
//  }
// int s = sc.nextInt();
// int ans= -1;

// for ( int i = 0; i<arr.length; i++){
//     if(arr[i]==s){
//         ans= i;
//         break;
//     }
// }
// System.out.println(ans);
// }
// }


//  check whether array is Sorted array 
// import java.util.Scanner;
// public class Main {
//  public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in);
//  int n = sc.nextInt();

//  int[] arr = new int[n];
//  for(int i = 0; i < n; i++){
//  arr[i] = sc.nextInt();
//  }
//  boolean flag= true;
// for(int i=1;i<arr.length; i++){
//     if(arr[i]< arr[i-1]){
//         flag= false;
//         break;
//     }
// }
//     if(flag== true){
//         System.out.println("True");
//     }
//     else{
//         System.out.println("False");
//     }

// }
// }



import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();

 int[] arr = new int[n];
 for(int i = 0; i < n; i++){
 arr[i] = sc.nextInt();
 }

}
}
