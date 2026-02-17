public class frequency_counting {

    static void count_Letters(String s) {

        s = s.toLowerCase();

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                freq[ch - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {

            if (freq[i] > 0) {

                char letter = (char) (i + 'a');
                System.out.println(letter + " : " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {

        String word = "SayedIssac";

        count_Letters(word);
    }
}
