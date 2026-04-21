package listoperations;
import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        // Initialize ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println("--- ArrayList Operations ---");
        performOperations(arrayList);

        System.out.println("\n--- LinkedList Operations ---");
        performOperations(linkedList);
    }

    public static void performOperations(List<String> list) {
        // 1. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("1. Initial List: " + list);

        // 2. Adding element at specific index
        list.add(1, "Mango");
        System.out.println("2. After adding Mango at index 1: " + list);

        // 3. Adding multiple elements
        List<String> extraFruits = Arrays.asList("Grapes", "Pineapple");
        list.addAll(extraFruits);
        System.out.println("3. After adding multiple elements: " + list);

        // 4. Accessing elements
        String fruit = list.get(2);
        System.out.println("4. Element at index 2: " + fruit);

        // 5. Updating elements
        list.set(0, "Strawberry");
        System.out.println("5. After updating index 0 to Strawberry: " + list);

        // 6. Removing elements
        list.remove("Banana"); // remove by object
        list.remove(2);        // remove by index
        System.out.println("6. After removing Banana and index 2: " + list);

        // 7. Searching elements
        boolean hasOrange = list.contains("Orange");
        int orangeIndex = list.indexOf("Orange");
        System.out.println("7. Contains 'Orange'? " + hasOrange + " at index: " + orangeIndex);

        // 8. List size
        System.out.println("8. Current List size: " + list.size());

        // 9. Iterating over list (Enhanced for-loop)
        System.out.print("9. Iterating (for-each): ");
        for (String f : list) {
            System.out.print(f + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("10. Using Iterator: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(list);
        System.out.println("11. Sorted List: " + list);

        // 12. Sublist
        if (list.size() >= 2) {
            List<String> sub = list.subList(0, 2);
            System.out.println("12. Sublist (index 0 to 2): " + sub);
        }

        // 13. Clearing the list
        list.clear();
        System.out.println("13. After clearing, is empty? " + list.isEmpty());
    }
}
