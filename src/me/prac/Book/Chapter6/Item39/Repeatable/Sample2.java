package me.prac.Book.Chapter6.Item39.Repeatable;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Sample2 {
    @ExceptionTest(ArithmeticException.class)
    public static void m1() { // 성공해야 한다.
        int i=0;
        i = i/i;
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m2() { // 실패해야 한다. (다른 예외 발생)
        int[] a= new int[0];
        int i = a[1];
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m3() {} // 실패해야 한다. (예외가 발생하지 않음)


    @ExceptionTest(IndexOutOfBoundsException.class)
    @ExceptionTest(ArrayIndexOutOfBoundsException.class)
    public static void doublyBad() {
        List<String> list = new ArrayList<>();
        list.addAll(5,list);
    }

    public static void main(String[] args) throws ClassNotFoundException {

        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName(args[0]);
        for(Method m : testClass.getDeclaredMethods()) {
            if(m.isAnnotationPresent(ExceptionTest.class) ||
                    m.isAnnotationPresent(ExceptionTestContainer.class)) {
                tests++;
                try {
                    m.invoke(null);
                } catch (Throwable wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    int oldPassed = passed;
                    ExceptionTest[] excTests = m.getAnnotationsByType(ExceptionTest.class);
                    for(ExceptionTest excTest : excTests) {
                        if (excTest.value().isInstance(exc)) {
                            passed++;
                            break;
                        }
                    }
                    if(passed == oldPassed)
                        System.out.printf("테스트 %s 실패: %s \n", m, exc);
                }
            }
        }
    }
}