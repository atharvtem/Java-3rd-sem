package com.company;

public class Tut34_recursion {
    static int factorial(int a){
//        int fact=1;
//        while(a>1){
//            fact*=a;
//            a--;
//        }
        if(a==0 || a==1){
            return 1;
        }
        else{
            return a*factorial(a-1);
        }

    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
