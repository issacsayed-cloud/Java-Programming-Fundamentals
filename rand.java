import java.util.Scanner;
class rand {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first word:");
        String s1 = sc.next();

        System.out.println("Enter second word:");
        String s2 = sc.next();

        if (s1.equals(s2)) {
            System.out.println("Same (case-sensitive)");
        } else {
            System.out.println("Different (case-sensitive)");
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Same (ignoring case)");
        } else {
            System.out.println("Different (ignoring case)");
        }
    }
}