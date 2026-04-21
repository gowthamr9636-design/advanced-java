package java;
public class StringOperations {
    public static void main(String[] args) {
        // 1. String Creation & Basic Operations
        String str1 = "Hello";
        String str2 = new String("Java World");

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("Equals (case sensitive): " + str1.equals("hello"));
        System.out.println("Equals (ignore case): " + str1.equalsIgnoreCase("HELLO"));

        // 4. String Searching
        System.out.println("Index of 'World': " + str2.indexOf("World"));
        System.out.println("Contains 'Java': " + str2.contains("Java"));

        // 5. Substring Operations
        System.out.println("Substring (index 5 to end): " + str2.substring(5));
        System.out.println("Substring (index 0 to 4): " + str2.substring(0, 4));

        // 6. String Modification
        System.out.println("Upper Case: " + str1.toUpperCase());
        System.out.println("Replace 'Java' with 'C++': " + str2.replace("Java", "C++"));

        // 7. Whitespace Handling
        String spaced = "   Trim Me   ";
        System.out.println("Trimmed: '" + spaced.trim() + "'");

        // 8. String Concatenation
        String combined = str1.concat(" Developer");
        System.out.println("Concatenated: " + combined);

        // 9. String Splitting
        String csv = "Apple,Banana,Cherry";
        String[] fruits = csv.split(",");
        System.out.println("Split result: " + fruits[0] + " | " + fruits[1]);

        // 10. StringBuilder Demo (Efficient modification)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Universe");
        sb.reverse();
        System.out.println("StringBuilder Reverse: " + sb);

        // 11. String Formatting
        String formatted = String.format("Language: %s, Version: %d", "Java", 17);
        System.out.println("Formatted: " + formatted);

        // 12. Validate Email
        validateEmail("user@example.com");
        validateEmail("invalid-email.com");
    }

    public static void validateEmail(String email) {
        boolean isValid = email.contains("@") && 
                          email.contains(".") && 
                          !email.startsWith("@") && 
                          (email.endsWith(".com") || email.endsWith(".org") || email.endsWith(".net"));
        
        System.out.println("Email '" + email + "' valid? " + isValid);
    }
}
