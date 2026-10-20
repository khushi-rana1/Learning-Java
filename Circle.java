import java.util.Scanner;

public class Circle {
    static class Circle1{
        double radius;
        public Circle1(double radius){
            this.radius = radius;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        Circle1 c = new Circle1(r);
        System.out.print("Radius of circle: " + c.radius);
    } 
}
