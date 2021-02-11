package me.prac.Book.item17.prac;

public class Complex {
    private final double re;
    private final double im;

    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() { return re; }
    public double getIm() { return im; }

    public static Complex valueOf(double re, double im) {
        return new Complex(re,im);
    }

    public Complex plus(Complex c) {
        return new Complex(re+c.re, im+c.im);
    }

}
