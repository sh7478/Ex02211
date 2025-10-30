package com.example.ex02211.ex4;

class Salesperson extends Employee{
    private double _basicSalary;
    private double _sales;
    private double _commission;
    public Salesperson(double basicSalary, double sales, double commission)
    {
        _basicSalary = basicSalary;
        _sales = sales;
        _commission = commission;
    }

    @Override
    public void calculateSalary()
    {
        System.out.println("The sale person salary is " + (_basicSalary + (_sales * _commission /100)));
    }

    @Override
    public void getDetails()
    {
        System.out.println("The sale person works around 9 hours and tries to sale items");
    }

    @Override
    public void performTask()
    {
        System.out.println("The sale person sales items of the company to costumers");
    }
}
