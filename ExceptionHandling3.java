//demonstration on how try-catch handles crashes
import java.util.Scanner;
public class ExceptionHandling3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j;
        try{
            switch(i){
                case 0: 
                    int zero = 0;
                    j = 10/0;
                    break;

                case 1: 
                    int arr[]= null;
                    j = arr[0];
                    break;

                default:
                    System.out.print("No exception");
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
