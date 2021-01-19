package me.prac.Book.Item6;

public class AutoBoxingTest {

    public void AutoBoxingExample() {
        long start = System.currentTimeMillis();
        Long sum = 0l;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.print("Long 1 test:");
        System.out.println(System.currentTimeMillis() - start); // 1

        start = System.currentTimeMillis();
        long sum2 = 0l;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum2 += i;
        }
        System.out.print("long 2 test:");
        System.out.println(System.currentTimeMillis()-start); // 2
    }
}
