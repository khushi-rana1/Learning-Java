import java.util.Scanner;
class Student {
    private String name;
    private int age;

    public  Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
        public String getname(){
            return name;
        }
        public int getage(){
            return age;
        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            Student s = new Student(name, age);
            System.out.println("Name: " + s.getname());
            System.out.println("Age: " + s.getage());
           
        }
    }
