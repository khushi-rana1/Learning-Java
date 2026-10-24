import java.util.Scanner;

public class LongestWord {
 public static String FindLongestWord(String s){
    //split sentence store it in a var
    //create a var for longest word
    //loop
    String word[] = s.split(" ");
    String longestWord = "";
    for( int i = 0; i < word.length; i++){
        if(word[i].length() > longestWord.length())
           longestWord = word[i];
    }
     return longestWord;
 } 
 public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String s = sc.nextLine();
    String longestWord = FindLongestWord(s);
    System.out.println("The Longest word is: " +longestWord);
}
}
