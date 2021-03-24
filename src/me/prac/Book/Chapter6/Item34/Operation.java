package me.prac.Book.Chapter6.Item34;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public enum  Operation {
    PLUS("+") {public double apply(double x, double y) { return x + y;}},
    MINUS("-") { public double apply(double x, double y) { return x - y;}},
    TIMES("*") { public double apply(double x, double y) {return x * y; }},
    DIVIDE("/") { public double apply(double x, double y) { return x / y;}};

    public abstract double apply(double x, double y);

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }
    @Override
    public String toString() {
        return "Operation{" +
                "symbol='" + symbol + '\'' +
                '}';
    }

    private static final Map<String,Operation> stringToEnum =
            Stream.of(values()).collect(toMap(Object::toString, e -> e));

    public static Optional<Operation> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }

    public static Operation inverse(Operation op) {
        switch (op) {
            case PLUS: return Operation.MINUS;
            case MINUS: return Operation.PLUS;
            case TIMES: return Operation.DIVIDE;
            case DIVIDE: return Operation.TIMES;
        }
        throw new AssertionError("x");
    };
}