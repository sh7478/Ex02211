package com.example.ex02211.ex1;

class Dog extends Animal{
    @Override
    public void makeSound()
    {
        System.out.println("The dog barks");
    }

    @Override
    public void move()
    {
        System.out.println("The dog move on land");
    }

    @Override
    public void eat()
    {
        System.out.println("The dog eats dog's food");
    }
}
