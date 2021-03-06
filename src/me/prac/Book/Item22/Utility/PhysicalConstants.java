package me.prac.Book.Item22.Utility;

public class PhysicalConstants {

    private PhysicalConstants() {}

    static final double AVOGADROS_NUMBER   = 6.022_140_857e23;
    static final double BOLTZMANN_CONSTANT = 1.380_648_52e-23;
    static final double ELECTRON_MASS      = 9.109_383_56e-31;

    public static double calculate() { return PhysicalConstants.AVOGADROS_NUMBER; }
    public static void main(String[] args) {
        double test = calculate();
    }
}
