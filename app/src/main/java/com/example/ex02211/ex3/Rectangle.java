package com.example.ex02211.ex3;

class Rectangle extends Shape
{
    private double _width;
    private double _length;

    public Rectangle(double width, double length)
    {
        _width = width;
        _length = length;
    }

    @Override
    public void calculateArea()
    {
        System.out.println("The area of the square is " + (_width * _length));
    }

    @Override
    public void calculatePerimeter()
    {
        System.out.println("The perimeter of the square is " + (2*_width + 2*_length));
    }
}
