import java.util.*;

public class PalindromeCheckerApp {
    static final String version = "1.0";

    public static void main(String[] args) {
//        System.out.println("Welcome to the Palindrome Checker Application");
//        System.out.println("Version: " + version);
//        System.out.println("System initialized successfully.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String word = sc.nextLine();

        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
