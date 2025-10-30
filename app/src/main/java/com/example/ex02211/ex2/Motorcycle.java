package com.example.ex02211.ex2;

class Motorcycle extends Vehicle {
    @Override
    public void stop()
    {
        System.out.println("The rider used the brakes and put feet down");
    }

    @Override
    public void start()
    {
        System.out.println("The motorcycle engine has started");
    }

    @Override
    public void accelerate()
    {
        System.out.println("The rider accelerated with the throttle");
    }
}
