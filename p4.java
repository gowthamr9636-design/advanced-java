package com.linkedlist;

import java.util.*;

public class p4{
    public static void main(String[] args) {
        LinkedList<String> l_listobj = new LinkedList<>(Arrays.asList("Java", "Python", "PHP", "C++"));
        
        for (int p = 0; p < l_listobj.size(); p++) {
            System.out.println("Position " + p + ": " + l_listobj.get(p));
        }
    }
}
