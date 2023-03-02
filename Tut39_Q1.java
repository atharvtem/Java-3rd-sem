package com.company;
import java.util.Scanner;

class kamgar
{
    int salary;
    public void getsalary()
    {
        System.out.println("Salary is: "+salary);
    }
    String name;
    public void getname()
    {
        System.out.println("Name of the employee is:" + name);
    }
    public void setname()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new name:");
        name = sc.next();
        System.out.println("New name of employee is:" + name);
    }
}

public class Tut39_Q1
{
    public static void main(String[] args)
    {
        kamgar chinya = new kamgar();
        chinya.salary=12345;
        chinya.name="Chinmay Wasule";
        chinya.getsalary();
        chinya.getname();
        chinya.setname();
    }
}
