package com.linkedlist;

import java.util.*;

public class p3 {
    public static void main(String[] args) {
        LinkedList<String> l_listobj = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));
        
        l_listobj.offerLast("Pink");
        System.out.println("Updated List: " + l_listobj);
    }
}
