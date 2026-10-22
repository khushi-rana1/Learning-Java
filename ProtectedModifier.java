import java.util.Scanner;
public class ProtectedModifier {
    static class Employee{
        protected int salary;
    }
    static class Manager extends Employee{

    }
public static void main(String[]args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter salary: ");
 int s = sc.nextInt();
 Manager m = new Manager();
 m.salary = s;
 System.out.println("Salary is: " + m.salary);
}
}
