package com.company;

class base
{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I'm setting x now in base class");
        this.x = x;
    }
    public void printme()
    {
        System.out.println("This is a constructor.");
    }
};

class derived extends base
{

};

public class Tut45_inheritance
{
    public static void main(String[] args)
    {
        base b = new base();
        derived d = new derived();
        b.setX(2);
        System.out.println(b.getX());
        d.setX(4);
        System.out.println(d.getX());
    }
}
