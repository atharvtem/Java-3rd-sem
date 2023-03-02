package com.company;

public class Tut29_sumOfArrayElements
{
    public static void main(String[] args)
    {
        float [] sum;
        sum = new float[5];
        sum[0]=1.0f;
        sum[1]=2.899f;
        sum[2]=5.732f;
        sum[3]=7.098f;
        sum[4]=4.256f;
        float addition=sum[0]+sum[1]+sum[2]+sum[3]+sum[4];
        System.out.println("Addition is :" + addition);
    }
}
