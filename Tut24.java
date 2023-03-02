package com.company;

public class Tut24
{
    public static void main(String[] args)
    {
        for(int i=1;i<11;i++)
        {
           if(i%2==0)
           {
               continue;
           }
            System.out.println(i);
        }
        int j=20;
        while(j>1)
        {
            if(j==5)
            {
                break;
            }
            System.out.println(j);
            j--;
        }
    }
}
