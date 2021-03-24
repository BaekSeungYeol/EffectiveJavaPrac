package me.prac.Book.Chapter6.Item34;

public class WeightTable {
    public static void main(String[] args) {
        double earthWeight = Double.parseDouble(args[0]);
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values()) {
            System.out.println(p + "에서의 무게는" + p.surfaceWeight(mass) + "이다");
        }
    }
}
