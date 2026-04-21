package java;

public class SubstringCounter {



    public static void main(String[] args) {
        String mainStr = "Java is great, Java is fun";
        String subStr = "Java";
        System.out.println("Occurrences: " + countOccurrences(mainStr, subStr));
    }

    public static int countOccurrences(String main, String sub) {
        if (sub.isEmpty()) return 0;
        int count = 0, index = 0;
        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }
}
