public class string {
    public static void main (String[] args){
        String str1 ="abc";
        int count = 0;
        for(int i = 0;i<str1.length(); i++){
            for( int j= i ; j<str1.length(); j++){
                if(str1.charAt(i)==str1.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println("final count is:" +count);
    }
}
