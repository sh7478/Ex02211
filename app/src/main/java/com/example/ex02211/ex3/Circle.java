package com.example.ex02211.ex3;

class Circle extends Shape
{
    private double _radius;

    public Circle(double radius)
    {
        _radius = radius;
    }

    @Override
    public void calculateArea()
    {
        System.out.println("The area of the circle is " + (Math.PI * _radius*_radius));
    }

    @Override
    public void calculatePerimeter()
    {
        System.out.println("The perimeter of the circle is " + (Math.PI * _radius*2));
    }
}
