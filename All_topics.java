class All_topics {

    // 1️⃣ Palindrome check (without reverse)
    static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // 2️⃣ Count vowels and consonants
    static void countLetters(String s) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // 3️⃣ Find duplicates in array
    static void findDuplicates(int[] arr) {

        System.out.println("Duplicate numbers:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        String word = "level";
        int[] numbers = {1, 2, 3, 2, 4, 5, 3};

        // Palindrome
        if (isPalindrome(word)) {
            System.out.println("Word is Palindrome");
        } else {
            System.out.println("Word is Not Palindrome");
        }

        // Count letters
        countLetters(word);

        // Duplicates
        findDuplicates(numbers);
    }
}
