//using interface to find square of a number
import java.util.Scanner;
interface Number{
    int square(int n);
}
class Square implements Number{
     public int square(int n){
        return n*n;
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Square s1 = new Square();
        System.out.println("Square of " + n + " is: " + s1.square(n) );
    }
}