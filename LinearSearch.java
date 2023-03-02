package com.company;

public class LinearSearch
{
    public static void main(String[] args)
    {
        int [] arr;
        arr= new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i=0;i<11;i++)
        {
            if(arr[i]==8)
            {
                System.out.println("Element found at " + i + "th Index " );
            }
        }
    }
}
