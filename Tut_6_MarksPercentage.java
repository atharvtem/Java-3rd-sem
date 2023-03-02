package com.company;
import java.util.Scanner;

public class Tut_6_MarksPercentage
{
    public static void main(String[] args)
    {
        System.out.println("Enter Your marks out of 10:");
        Scanner sc = new Scanner(System.in);
        int bruh= sc.nextInt();
        System.out.println(((bruh*100)/10) + "%");
    }

}
