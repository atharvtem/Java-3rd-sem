package com.company;
import java.util.Scanner;

class phone
{
    public static void ringing()
    {
        System.out.println("Now Phone is on Ring Mode");
    }
    public static void vibrating()
    {
        System.out.println("Now Phone is on vibrating mode");
    }
    public static void mute()
    {
        System.out.println("Now Phone is on mute");
    }
}

public class Tut39_Q2
{
    public static void main(String[] args)
    {
        phone state = new phone();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Ring");
        System.out.println("2.Vibrate");
        System.out.println("3.Mute");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1: phone.ringing();
                    break;
            case 2: phone.vibrating();
                    break;
            case 3: phone.mute();
                    break;
        }
    }
}
