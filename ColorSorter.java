package color.management;

import java.util.ArrayList;

public class p5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Purple");
        colors.add("Pink");

        int n = 2; // Let's say we want to remove the 2nd element
        
        if (n > 0 && n <= colors.size()) {
            colors.remove(n - 1); // Index is always n-1
            System.out.println("List after removing element " + n + ": " + colors);
        }
    }
}
