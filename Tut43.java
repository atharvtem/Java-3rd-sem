package com.company;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

class game
{
    public static double random_num;
    public static int random_num_generator()
    {
        Random r = new Random();
        double a = r.nextDouble();
        double random_num = Math.floor(a * 100);
        return (int) random_num;
    }
    public static int take_input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a guess number between 1 and 100");
        int input = sc.nextInt();
        correctness(input);
        return input;
    }
    public static void correctness(int input)
    {
        if(input<1 || input>100)
        {
            game.take_input();
        }
    }
    public static int nexttry(int input, int num, int i)
    {
        if(input < num)
        {
            out.println("You entered number is less than Magic Number");
            out.println("Please Enter bigger number");
        }
        else if(input > num)
        {
            out.println("You entered number is greater than Magic Number");
            out.println("Please Enter smaller number");
        }
        else if(input==num)
        {
            out.println("Hurrah!!! You Won!!!");
            out.println("Magic number was : " + num);
            out.println("Game Over!!!");
            i=11;
        }
        return i;
    }
    public static void main_try(int num)
    {
        for(int i=1;i<11;i++)
        {
            out.println("**************************************");
            System.out.println("Try Number :" + i);
            int input = game.take_input();
            i=game.nexttry(input,num,i);
            if(i>10)
            {
                break;
            }
        }
    }
};

public class Tut43
{
    public static void main(String[] args)
    {
        int num = game.random_num_generator();
        game.main_try(num);
    }
}
