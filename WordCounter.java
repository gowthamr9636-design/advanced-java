package java;

public class WordCounter {


    public static void main(String[] args) {
        String sentence = "  Java programming is   highly versatile  ";
        System.out.println("Word count: " + countWords(sentence));
    }

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        // Split by one or more whitespace characters
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
