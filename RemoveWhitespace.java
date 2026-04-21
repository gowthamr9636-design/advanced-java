package java;

public class RemoveWhitespace {


    public static void main(String[] args) {
        String text = " J a v a   P r o g r a m ";
        System.out.println("Before: [" + text + "]");
        System.out.println("After: [" + removeWhitespace(text) + "]");
    }

    public static String removeWhitespace(String str) {
        if (str == null) return null;
        return str.replaceAll("\\s", "");
    }
}
