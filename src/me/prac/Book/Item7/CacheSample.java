package me.prac.Book.Item7;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class CacheSample {

    public static void main(String[] args) {
        Object key1 = new Object();
        Object value1 = new Object();


       // 1
        Map<Object, Object> cache = new HashMap<>();
        cache.put(key1,value1);

        //  2
        Map<Object, Object> cache2 = new WeakHashMap<>();
        cache2.put(key1,value1);
    }
}
