package java;

public class PalindromeCheck {


    public static void main(String[] args) {
        String test = "A man, a plan, a canal: Panama";
        System.out.println("Is palindrome: " + isPalindrome(test));
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        // Keep only alphanumeric characters and lowercase them
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }
}
