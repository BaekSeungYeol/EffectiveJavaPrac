package me.prac.Book.Item23.archy;

public class Circle extends Figure{

    final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {return (radius*radius)*Math.PI ;}
}
