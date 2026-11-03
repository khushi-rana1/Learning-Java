import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String originalString = sc.nextLine();
        String reversesString ="";
        for( int i = originalString.length() - 1; i >= 0; i-- ){
            reversesString = reversesString + originalString.charAt(i);
        }
        if(originalString.equals(reversesString)){
            System.out.println(originalString + " is a palindrome.");
        }
        else{
            System.out.println(originalString + " is not a palindrome.");
         }
    }

}
