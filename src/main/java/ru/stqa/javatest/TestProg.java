package ru.stqa.javatest;

public class TestProg {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println(s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println(r.area());
    }
}