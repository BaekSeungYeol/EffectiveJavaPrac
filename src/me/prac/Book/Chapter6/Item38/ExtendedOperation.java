package me.prac.Book.Chapter6.Item38;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public enum  ExtendedOperation implements Operation{

    EXP("^") { public double apply(double x, double y) {  return Math.pow(x,y); } },

    REMAINDER("%") { public double apply(double x, double y) { return x % y; } };

    private final String symbol;
    ExtendedOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        test(Arrays.asList(ExtendedOperation.values()),x,y);

//    test(ExtendedOperation.class,x,y);
    }

    private static void test(Collection<? extends Operation> opSet, double x, double y) {
        for(Operation op : opSet) {
            System.out.printf("%f %s %f = %f \n", x, op, y, op.apply(x,y));
        }
    }


//    static <T extends Enum<T> & Operation> void test(Class<T> opEnumType, double x, double y) {
//
//        for(Operation op  : opEnumType.getEnumConstants()) {
//            System.out.printf("%f %s %f = %f \n", x, op, y, op.apply(x,y));
//        }
//    }


}
