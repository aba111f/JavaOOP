package com.example.generics;

import java.util.Comparator;

public class SortShirtByCount implements Comparator<Shirt> {

    public int compare(Shirt s1, Shirt s2) {
        
        Long cl = new Long (s1.getCount()); 
        Long c2 = new Long (s2.getCount());
        return cl.compareTo(c2);
    }
        

}

