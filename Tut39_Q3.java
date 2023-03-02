package com.company;
import java.util.Scanner;

class square
{
    Scanner sc = new Scanner(System.in);
    int side;
    public void setside()
    {
        System.out.println("Enter the side of the square: ");
        side=sc.nextInt();
        System.out.println("Side set to "+side);
    }
    public void sq_area()
    {
        int area = side*side;
        System.out.println("area of the square of side is "+area);
    }
    public void sq_perimeter()
    {
        int perimeter = side*4;
        System.out.println("volume of the square of side is "+perimeter);
    }
}

public class Tut39_Q3
{
    public static void main(String[] args)
    {
        square sq = new square();
        sq.setside();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Area of Square");
        System.out.println("2.Perimeter of Square");
        int choice = sc.nextInt();
        switch(choice)
        {
            case(1): sq.sq_area();
                    break;
            case(2): sq.sq_perimeter();
                    break;
        }
    }
}
