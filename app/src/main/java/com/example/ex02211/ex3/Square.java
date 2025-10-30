package com.example.ex02211.ex3;

class Square extends Shape
{
    private double _side;

    public Square(double side)
    {
        _side = side;
    }

    @Override
    public void calculateArea()
    {
        System.out.println("The area of the square is " + (_side * _side));
    }

    @Override
    public void calculatePerimeter()
    {
        System.out.println("The perimeter of the square is " + (_side * 4));
    }
}
