package color.management;

import java.util.ArrayList;
import java.util.Collections;

public class p3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Blue");

        Collections.sort(colors);

        System.out.println("Sorted Colors: " + colors);
    }
}
