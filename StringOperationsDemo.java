package java;

public class StringOperationsDemo {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello"; // Using literal
        String str2 = new String("World"); // Using new keyword

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("Equals 'hello' (ignore case): " + str1.equalsIgnoreCase("hello"));
        System.out.println("CompareTo (str1 vs str2): " + str1.compareTo(str2));

        // 4. String Searching
        String searchStr = "Hello World";
        System.out.println("Index of 'o': " + searchStr.indexOf('o'));
        System.out.println("Last Index of 'o': " + searchStr.lastIndexOf('o'));

        // 5. Substring Operations
        System.out.println("Substring from index 0 to 5: " + searchStr.substring(0, 5));

        // 6. String Modification
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Replace 'H' with 'J': " + str1.replace('H', 'J'));

        // 7. Whitespace Handling
        String spaced = "   Java Programming   ";
        System.out.println("Trimmed: '" + spaced.trim() + "'");

        // 8. String Concatenation
        String combined = str1.concat(" ").concat(str2);
        System.out.println("Concatenated: " + combined);

        // 9. String Splitting
        String csv = "Java,Python,C++";
        String[] languages = csv.split(",");
        System.out.print("Split Result: ");
        for (String lang : languages) System.out.print(lang + " ");
        System.out.println();

        // 10. StringBuilder Demo (Mutable String)
        StringBuilder sb = new StringBuilder("Build");
        sb.append("er");
        sb.reverse();
        System.out.println("StringBuilder Result: " + sb);

        // 11. String Formatting
        String formatted = String.format("Language: %s, Version: %d", "Java", 21);
        System.out.println("Formatted String: " + formatted);

        // 12. Validate Email with contains(), startsWith(), and endsWith()
        validateEmail("student@university.edu");
        validateEmail("@invalid.com");
    }

    public static void validateEmail(String email) {
        // Validation logic using specific requested methods
        boolean isValid = email.contains("@") && 
                          email.contains(".") && 
                          !email.startsWith("@") && 
                          (email.endsWith(".com") || email.endsWith(".edu") || email.endsWith(".org"));
        
        System.out.println("Is '" + email + "' a valid email? " + isValid);
    }
}
