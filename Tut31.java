package com.company;

public class Tut31
{
    static int add(int x, int y)
    {
        int z;
        z=x+y;
        return z;
    }
    public static void main(String[] args)
    {
        int a=4,b=8;
        int c = add(a,b);
        System.out.println("Addition is :" + c);
    }
}
