package color.management;

import java.util.ArrayList;
import java.util.List;

public class p4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");    // 1st
        colors.add("Blue");   // 2nd
        colors.add("Green");
        colors.add("Black");

        List<String> subList = colors.subList(0, 2);

        System.out.println("Extracted Elements: " + subList);
    }
}
