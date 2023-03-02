package com.company;

class base1
{
    base1()
    {
        System.out.println("This is base class constructor");
    }
    base1(int a)
    {
        System.out.println(a+") This is base class constructor");
    }
}

class derived1 extends base1
{
    derived1()
    {
        System.out.println("This is derived class constructor");
    }
    derived1(int x)
    {
        super(x);
        System.out.println(x+") This is derived class constructor");
    }
}

public class Tut46_ConstructorsInINHERITANCE
{
    public static void main(String[] args) {
//        base1 b1 = new base1();
        derived1 d1 = new derived1(1);

    }
}
