package com.company;

public class Tut33_VariableArguments {

    static int add(int ... arr){
        int result = 0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Addition of 1 is :" + add(1));
        System.out.println("Addition of 1,2 is :" + add(1,2));
        System.out.println("Addition of 1,2,3 is :" + add(1,2,3));
        System.out.println("Addition of 1,2,3,4 is :" + add(1,2,3,4));
        System.out.println("Addition of 1,2,3,4,5 is :" + add(1,2,3,4,5));
        System.out.println("Addition of 1,2,3,4,5,6 is :" + add(1,2,3,4,5,6));
        System.out.println("Addition of 1,2,3,4,5,6,7 is :" + add(1,2,3,4,5,6,7));
        System.out.println("Addition of 1,2,3,4,5,6,7,8 is :" + add(1,2,3,4,5,6,7,8));
        System.out.println("Addition of 1,2,3,4,5,6,7,8,9 is :" + add(1,2,3,4,5,6,7,8,9));
        System.out.println("Addition of 1,2,3,4,5,6,7,8,9,10 is :" + add(1,2,3,4,5,6,7,8,9,10));
    }
}
