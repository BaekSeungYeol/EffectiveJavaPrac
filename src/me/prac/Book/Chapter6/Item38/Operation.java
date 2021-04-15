package me.prac.Book.Chapter6.Item38;

public interface Operation {
    double apply(double x, double y);

    public enum BasicOperation implements Operation {
        PLUS("+") {public double apply(double x, double y) { return x + y;}},
        MINUS("-") { public double apply(double x, double y) { return x - y;}},
        TIMES("*") { public double apply(double x, double y) {return x * y; }},
        DIVIDE("/") { public double apply(double x, double y) { return x / y;}};

        private final String symbol;

        BasicOperation(String symbol) {
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return symbol;
        }
    }
}