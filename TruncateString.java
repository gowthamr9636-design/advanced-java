package java;

public class TruncateString {


    public static void main(String[] args) {
        String text = "This is a very long sentence that needs shortening.";
        System.out.println(truncate(text, 20));
    }

    public static String truncate(String str, int length) {
        if (str == null || str.length() <= length) {
            return str;
        }
        return str.substring(0, length) + "...";
    }
}
