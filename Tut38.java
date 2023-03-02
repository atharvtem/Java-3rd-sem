package com.company;

class student
{
    int prn;
    String name;
    public void details()
    {
        System.out.println("PRN No. --> " + prn);
        System.out.println("Name of the student is " + name);
    }
}

public class Tut38
{
    public static void main(String[] args)
    {
        student atharv = new student();
        student prasad = new student();
        atharv.prn=22110317;
        atharv.name="Atharv Tembhurnikar";
        atharv.details();
        prasad.prn = 22110385;
        prasad.name = "Prasad Jagadale";
        prasad.details();
    }
}
