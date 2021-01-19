package me.prac.Book.Item6;

public class StringTest {
    public void StringObjectEqualExample() {
        String name = new String("seungYeol");
        String name2 = new String("seungYeol");

        // 두 객체의 주소는 같지 않다.
        System.out.println(name == name2);

        System.out.println(name.equals(name2));
    }
}
