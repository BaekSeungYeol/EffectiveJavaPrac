package me.prac.Book.Item31;
import java.util.*;

public class Swap {
    public static void swap(List<?> list, int i, int j) {
        swapHelper(list, i, j);
    }

    private static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }



    public static void main(String[] args) {
        // 첫 번째와 마지막 인수를 스왑한 후 결과 리스트를 출력한다.
        List<String> argList = Arrays.asList(args);
        swap(argList, 0, argList.size() - 1);
        System.out.println(argList);
    }
}
