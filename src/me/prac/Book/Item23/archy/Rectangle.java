package me.prac.Book.Item23.archy;

public class Rectangle extends Figure{

    final double length;
    final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() { return length*width; }
}
