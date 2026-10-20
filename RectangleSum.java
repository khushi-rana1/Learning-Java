//Sum of length & width using class and object
import java.util.Scanner;
public class RectangleSum {
    static class Rectangle{
        int length;
        int width;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length: ");
    int l = sc.nextInt();
    System.out.print("Enter width: ");
    int w = sc.nextInt();
    Rectangle rec = new Rectangle();
    rec.length = l;
    rec.width = w;
    System.out.print("Sum of length and width is: "  + (rec.length + rec.width));
}
}
