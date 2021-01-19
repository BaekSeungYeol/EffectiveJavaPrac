package me.prac.Book.Item6;

public class BooleanTest {

    public void BooleanStaticMethodExample() {
        Boolean true1 = Boolean.valueOf("true");
        Boolean true2 = Boolean.valueOf("true");

        System.out.println(true1 == true2);
        System.out.println(true1 == Boolean.TRUE);
        Boolean bb = new Boolean("true");
    }
}
