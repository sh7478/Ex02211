package com.example.ex02211.ex3;

class Triangle extends Shape {
    private double _highet;
    private double _base;
    private double _side1;
    private double _side2;

    public Triangle(double highet, double base, double side1, double side2)
    {
        _highet = highet;
        _base = base;
        _side1 = side1;
        _side2 = side2;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of the triangle is " + (_base * _highet / 2));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of the triangle is " + (_base + _side1 + _side2));

    }
}
