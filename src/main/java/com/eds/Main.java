package com.eds;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by vitaliy.vorona on 10/27/2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Hashtable<String, ArrayList> table = new Hashtable<String, ArrayList>();
        ArrayList<String> list = new ArrayList<String>();
        list.add(1, "Name");
        list.add(2, "Surname");



        table.put("1", list);
    }
}
