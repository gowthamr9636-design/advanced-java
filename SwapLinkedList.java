package com.linkedlist;

import java.util.*;

public class p2 {
    public static void main(String[] args) {
        LinkedList<String> objlist = new LinkedList<>(Arrays.asList("First", "Second", "Third"));
        
        Iterator it = objlist.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
