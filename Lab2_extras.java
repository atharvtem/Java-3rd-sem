package com.company;
import java.util.Scanner;

public class Lab2_extras
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Maths (out of 100) : ");
        byte m = sc.nextByte();
        System.out.println("Enter Marks of Science (out of 100) : ");
        byte s = sc.nextByte();
        System.out.println("Enter Marks of English (out of 100) : ");
        byte e = sc.nextByte();
        float percentage = (((m+s+e)*100)/300);
        System.out.println("Your Percentage is : " +percentage + "%");
        if(percentage>35)
        {
            if(percentage>90)
            {
                System.out.println("Hurrah!!! You passed with Distinction. :) ");
            }
            else
            {
                System.out.println("You passed! :) ");
            }

        }
        else
        {
            System.out.println("You failed :( ");
        }
    }
}
