package me.prac.Book.Item28;

import java.util.ArrayList;
import java.util.List;

public class Array {

    public static void main(String[] args) {
        Object[] objectArray = new Long[1];
        objectArray[0] = "타입 다름"; // ArrayStoreException

       // List<Object> ol =new ArrayList<Long>();
//        ol.add("타입 다름");
//
//        List<String>[] stringLists = new List<String>[1]; // (1)
//        List<Integer> intList = List.of(42); // (2)
//        Object[] objects = stringLists; // (3)
//        objects[0] = intList; // (4)
//        String s= stringLists[0].get(0); // (5)
    }
}
