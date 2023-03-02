package com.company;

class Employee
{
    int id;
    String name;
}

public class Tut36_StartOfOOPs
{
    public static void main(String[] args)
    {
        Employee atharv = new Employee();
        atharv.id=21;
        atharv.name = "Atharv Tembhurnikar";
        System.out.println(atharv.id);
        System.out.println(atharv.name);
    }
}
