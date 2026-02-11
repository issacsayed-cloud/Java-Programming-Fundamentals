public class max_freq_count {
    public static void main(String[] args){
        String s = "issacsayed";
        int[] freq = new int[26];
        for(int i = 0;i < s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        int max_count = 0;
        int max_index = 0;

        for(int i = 0; i<26; i++){
            if(freq[i] > max_count){
                max_count = freq[i];
                max_index = i;
            }
        }

        char most_freq = (char)(max_index + 'a');
        System.out.println("Most frequent character = " + most_freq);
        System.out.println("Count = " + max_count);
    }
}
