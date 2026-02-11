import java.util.Scanner;
public class anagram {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 1st word: ");
        String s1 = sc.next();

        System.out.println("Enter your 2nd word: ");
        String s2 = sc.next();

        if(s1.length() != s2.length()){
            System.out.println("Not Anagrams");
            return;
        }

        int[] freq = new int[26];
        for(int i = 0; i < s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        Boolean is_anagram = true;

        for(int i = 0;i<26; i++){
            if(freq[i] != 0){
                is_anagram = false;
                break;
            }
        }

        if(is_anagram){
            System.out.println("words are anagrams");
        }else{
            System.out.println("words are not anagrams");
        }

    }
}
