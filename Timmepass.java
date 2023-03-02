package com.company;
import java.util.Scanner;

public class Timmepass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\t*****Cadevar Count*****");
        System.out.println("Enter College Name: ");
        String clg1 = sc.next();
        String clg2 = "BAVMC";
        if(clg1.equals(clg2))
        {
            System.out.println("Sorry,no Cadevar found.");
        }
        else
        {
            System.out.println("Cadevars found");
        }
    }
}
