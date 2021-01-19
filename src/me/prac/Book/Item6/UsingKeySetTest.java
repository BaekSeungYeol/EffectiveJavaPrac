package me.prac.Book.Item6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UsingKeySetTest {

    public void UsingKeySetTest() {
        Map<String, Integer> menu = new HashMap<>();
        menu.put("Burger", 8);
        menu.put("Pizza", 9);

        Set<String> names1 = menu.keySet();
        Set<String> names2 = menu.keySet();

        System.out.println(names1 == names2); // true

        names1.remove("Burger");
        System.out.println(names2.size()); // 1
        System.out.println(menu.size()); // 1
    }
}
