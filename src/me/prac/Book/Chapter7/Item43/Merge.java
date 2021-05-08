package me.prac.Book.Chapter7.Item43;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class Merge {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        String key = "key";

        map.put(key,3);
        //map.merge(key,1,(count,incr) -> count+incr);
        map.merge(key,1,Integer::sum);


        System.out.println(map.get(key)); // 4
    }
}
