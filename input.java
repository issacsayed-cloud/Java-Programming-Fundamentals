import java.util.Scanner;
public class input {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter your sentence:");
        String sentence = sc.nextLine();



        System.out.println("Enter your number:");
        int number = sc.nextInt();



        System.out.println("Enter a word:");
        String word = sc.next();

        System.out.println("Sentence : " + sentence);
        System.out.println("Number : " + number);
        System.out.println("Word : " + word);*/

        System.out.println("Enter a sentence:");
        String word = sc.nextLine();
        word = word.toLowerCase();
        int count = 0;
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }

        System.out.println("Number of vowels in your sentence = " + count);

    }
}

