package java;

public class NullOrEmptyCheck {



    public static void main(String[] args) {
        System.out.println("Result for null: " + isNullOrEmpty(null));
        System.out.println("Result for '   ': " + isNullOrEmpty("   "));
        System.out.println("Result for 'Java': " + isNullOrEmpty("Java"));
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
