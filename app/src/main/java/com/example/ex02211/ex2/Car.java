package com.example.ex02211.ex2;

class Car extends Vehicle{
    @Override
    public void stop()
    {
        System.out.println("the brake pedal has been pressed");
    }

    @Override
    public void start()
    {
        System.out.println("The car engin has started");
    }

    @Override
    public void accelerate()
    {
        System.out.println("The gas pedal had been pressed");
    }
}