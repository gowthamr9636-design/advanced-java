package color.management;

import java.util.ArrayList;

public class p2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green"); // 2nd element (index 1)
        colors.add("Blue");
        colors.add("Orange");

        colors.remove(1);      // Removes "Green"
        colors.remove("Blue"); // Removes "Blue"

        System.out.println("Updated List: " + colors);
    }
}
