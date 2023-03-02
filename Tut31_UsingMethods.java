package com.company;

public class Tut31_UsingMethods
{
    int add(int x,int y)
    {
        int z =x+y;
        return z;
    }

    public static void main(String[] args)
    {
        int a=2,b=8;
        Tut31_UsingMethods obj = new Tut31_UsingMethods();
        int c= obj.add(a,b);
        System.out.println(c);
    }
}
