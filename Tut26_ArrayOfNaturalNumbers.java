package com.company;

public class Tut26_ArrayOfNaturalNumbers
{
    public static void main(String[] args)
    {
        int num=1,mun=0;
        int [] Arr;
        Arr = new int[100];
        for(int i=1;i<101;i++)
        {
            Arr [i-1] = num;
            num++;
        }
        while(mun<100)
        {
            System.out.print(Arr[mun] + ", ");
            mun++;
        }
        System.out.println("");
        System.out.println(Arr.length);
    }
}
