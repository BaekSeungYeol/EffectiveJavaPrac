package me.prac.Book.Item33;

import java.util.*;


public class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<>();

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }

    public static void main(String[] args) {
//        Favorites f = new Favorites();
//
//        f.putFavorite(String.class, "Java");
//        f.putFavorite(Integer.class, 0xcafebabe);
//        f.putFavorite(Class.class, Favorites.class);
//
//        String favoriteString = f.getFavorite(String.class);
//        int favoriteInteger = f.getFavorite(Integer.class);
//        Class<?> favoriteClass = f.getFavorite(Class.class);
//
//        System.out.printf("%s %x %s%n", favoriteString,
//                favoriteInteger, favoriteClass.getName());

        Favorites f = new Favorites();
//        f.putFavorite((Class)Integer.class, "Integer의 인스턴스가 아닙니다.");


        List<String> pets = List.of("개", "고양이", "앵무");
        //f.putFavorite(List<String>.class,pets);

        Integer favorite = f.getFavorite(Integer.class); // ClassCastException
    }



    public <T> void putFavorite(Class<T> type, T instance) {
        favorites.put(Objects.requireNonNull(type), type.cast(instance));
    }
}

