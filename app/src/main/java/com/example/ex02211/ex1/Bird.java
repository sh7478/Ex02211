package com.example.ex02211.ex1;

class Bird extends Animal{
    @Override
    public void makeSound()
    {
        System.out.println("The birds tweet");
    }

    @Override
    public void move()
    {
        System.out.println("The bird fly");
    }

    @Override
    public void eat()
    {
        System.out.println("The bird eats seeds");
    }
}
