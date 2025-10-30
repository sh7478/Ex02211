package com.example.ex02211.ex1;

class Cat extends Animal{
    @Override
    public void makeSound()
    {
        System.out.println("The cat mewos");
    }

    @Override
    public void move()
    {
        System.out.println("The cat move on land");
    }
    @Override
    public void eat()
    {
        System.out.println("The cat eats cat's food");
    }
}
