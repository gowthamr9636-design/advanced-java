package color.management;

import java.util.ArrayList;

public class p1 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        if (colors.contains("Red")) {
            System.out.println("Found the color Red!");
        } else {
            System.out.println("Red is not in the list.");
        }
    }
}
