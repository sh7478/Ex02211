package com.example.ex02211.ex1;

class Fish extends Animal{
    @Override
    public void makeSound()
    {
        System.out.println("The fish pops");
    }

    @Override
    public void move()
    {
        System.out.println("The fish swims");
    }

    @Override
    public void eat()
    {
        System.out.println("The fish eats fish's food");
    }
}
