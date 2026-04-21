package com.linkedlist;

import java.util.*;

public class p1 {
    public static void main(String[] args) {
        LinkedList<String> listobj = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        
        // Start at index 1 (the 2nd position)
        Iterator iteratorobj = listobj.listIterator(1); 
        while (iteratorobj.hasNext()) {
            System.out.println(iteratorobj.next());
        }
    }
}
