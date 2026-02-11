import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word :");
        String word = sc.next();
        String rev = "";

        for(int i = word.length() - 1; i>=0; i--){
            rev = rev + word.charAt(i);
        }

        if(word.equals(rev)){
            System.out.println("word is a palindrome");
        } else{
            System.out.println("word is not a palindrome");
        }
    }
}
