public class practice {
    public static void main(String[] args) {

        /*for (int i = 1; i <=10;i++) {
            System.out.println(i);
            }*/


        /*for (int i = 10; i>=1; i--){
            System.out.println(i);
            }*/


        /*int num = 9;
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }*/

        /*int num = 5;
        for (int i = 1; i<=10 ; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }*/

        /*int sum = 0;
        for (int i = 1; i<=10; i++) {
            sum = sum + i;
        }

        System.out.println("Sum is = " + sum);*/


        /*int[] marks = {10,20,30,40,50};
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }*/

        /*int[] numbers = {10,20,30,40,50};
        int i = 0;
        while (i < numbers.length){
            System.out.println(numbers[i]);
            i++;
        }*/


        /*int[] arr = {5,10,15,20};
        arr[1] = 25;
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }*/

        /*int[] array = {1,2,3,4,5,6,7};
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }

        System.out.println("Sum is = " + sum);*/

        /*int[] arr = {5,3,9,2};
        int max_num = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i] > max_num) {
                max_num = arr[i];
            }
        }

        System.out.println("Maximum value = " + max_num);*/

        /*int[] arr = {1, 2, 4, 7, 8};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Even numbers count = " + count);*/

        /*int[] arr = {1,2,3,4,5};
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[4-i]);
        }*/

        /*int[] arr = {1, 3, 5, 7};
        int k = 9;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                found = true;
                break;   // stop searching
            }
        }

        System.out.println(found);*/

        /*String s1 = "Code";
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }*/

        /*String s = "CodeJava";
        s = s.toLowerCase();

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < vowels.length; j++) {

                if (s.charAt(i) == vowels[j]) {
                    count++;
                }
            }
        }

        System.out.println("Count = " + count);*/

        /*String s = "Code";

        // Loop from last index to 0
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));  // print without new line
        }*/

        /*String s = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is NOT a palindrome");
        }*/

        /*String sentence = "I am learning Java";

        // Split string by spaces
        String[] words = sentence.split(" ");
        System.out.println("Number of words = " + words.length);*/




    }
}