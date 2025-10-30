package com.example.ex02211.ex4;

class Manager extends Employee{
    private double _basicSalary;
    private double _moneyFromBonus;

    public Manager(double basicSalary, double moneyFromBonus)
    {
        _basicSalary = basicSalary;
        _moneyFromBonus = moneyFromBonus;
    }

    @Override
    public void calculateSalary()
    {
        System.out.println("The manager salary is " + (_basicSalary + _moneyFromBonus));
    }

    @Override
    public void getDetails()
    {
        System.out.println("the manager take care of his sale team");
    }

    @Override
    public void performTask()
    {
        System.out.println("The manager makes sure the company is running");
    }
}
