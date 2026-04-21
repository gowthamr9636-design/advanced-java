package com.linkedlist;

import java.util.*;

public class p5{
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
        
        System.out.println("Before swap: " + l_list);
        // Swaps index 0 (1st) and index 2 (3rd)
        Collections.swap(l_list, 0, 2); 
        System.out.println("After swap: " + l_list);
    }
}
