package com.example.ex02211.ex4;

class Developer extends Employee{
    private double _basicSalary;
    public Developer(double basicSalary)
    {
        _basicSalary = basicSalary;
    }

    @Override
    public void calculateSalary()
    {
        System.out.println("The developer salary is " + _basicSalary);
    }

    @Override
    public void getDetails()
    {
        System.out.println("The developer works around 8 hours and works on softwares");
    }

    @Override
    public void performTask()
    {
        System.out.println("The developer builds an app for the company");
    }
}
