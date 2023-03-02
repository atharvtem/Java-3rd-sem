package com.company;
import java.util.Scanner;

class cylinder
{
    public static int rad;
    public static int hgt;
    public static void set_radius(int a)
    {
        rad=a;
    }
    public static int get_radius()
    {
        return rad;
    }
    public static void set_height(int a)
    {
        hgt=a;
    }
    public static int get_height()
    {
        return hgt;
    }
    public static int get_area(int r,int h)
    {
        int pi = 22/7;
        return ((2*pi*rad*hgt)+(pi*rad*rad));
    }
    public static int get_volume(int r,int h)
    {
        int pi = 22/7;
        return (pi*rad*rad*hgt);
    }
};

public class Tut44_1and2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius for cylinder : ");
        int a=sc.nextInt();
        System.out.println("Enter Height for cylinder : ");
        int b=sc.nextInt();
        cylinder.set_radius(a);
        cylinder.set_height(b);
        System.out.println("Radius : " + cylinder.get_radius());
        System.out.println("Height : " + cylinder.get_height());
        System.out.println("Area : " + cylinder.get_area(a,b));
        System.out.println("Area : " + cylinder.get_volume(a,b));
    }
}
