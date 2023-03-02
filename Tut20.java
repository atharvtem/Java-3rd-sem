package com.company;
import java.util.Random;
import java.util.Scanner;

public class Tut20
{
    public static void main(String[]  args)
    {
        int n=1;
        while(n==1) {
            Scanner sc = new Scanner(System.in);
            Random r = new Random();
            double a = r.nextDouble();
            double b = Math.floor(a * 3);
            String computer;
            if (b == 0) {
                computer = "Rock";
            } else if (b == 1) {
                computer = "Paper";
            } else {
                computer = "Scissor";
            }
            System.out.println("Choose: ");
            System.out.println("Press 1 for Rock");
            System.out.println("Press 2 for Paper");
            System.out.println("Press 3 for Scissor");
            int c = sc.nextInt();
            while (c < 1 || c > 3) {
                System.out.println("Invalid Input. Try Again!!!");
                c = sc.nextInt();
            }
            String user;
            if (c == 1) {
                user = "Rock";
            } else if (c == 2) {
                user = "Paper";
            } else {
                user = "Scissor";
            }
            if (user.equals(computer)) {
                System.out.println("Tie");
            } else if (c == 1 && b == 1) {
                System.out.println("Computer Wins");
            } else if (c == 1 && b == 2) {
                System.out.println("User Wins");
            } else if (c == 2 && b == 0) {
                System.out.println("User Wins");
            } else if (c == 2 && b == 2) {
                System.out.println("Computer Wins");
            } else if (c == 3 && b == 0) {
                System.out.println("Computer Wins");
            } else if (c == 3 && b == 1) {
                System.out.println("User Wins");
            } else
            {
                System.out.println("Kuch to gadbad hai");
            }
            System.out.println("Do you want to continue?");
            System.out.println("Press 1 for yes");
            System.out.println("Press 0 for no");
            n = sc.nextInt();
            if(n==1)
            {
                continue;
            } else if (n==0)
            {
                break;
            }
            else
            {
                n=1;
                while(n==1)
                {
                    System.out.println("Invalid Input.Try again!!!");
                    n = sc.nextInt();
                    if (n < 0 && n > 1) {
                        System.out.println("Invalid!!");
                        continue;
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
