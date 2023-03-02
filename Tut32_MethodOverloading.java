package com.company;

public class Tut32_MethodOverloading
{
    static void foo(){
        System.out.println("Good Morning Buddy");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " Buddy");
    }

    static void foo(String name){
        System.out.println("Good Morning " + name);
    }

    static void foo(boolean hehe){
        System.out.println("Good Morning my " + hehe + " Friend");
    }

    public static void main(String[] args)
    {
        foo();
        foo(2);
        foo("Atharv");
        foo(2<7);
    }
}
