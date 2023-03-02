/*
    Create a database using array and perform following operations on it:

    1) add a record
    2) display database
    3) search a record (binary search)
    4) delete a record

*/

package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Lab3
{
    public static void main(String[] args)
    {
        int[] arr1={1,2,3,4,5};
        int size=100;
        System.out.println("Choose Option: ");
        System.out.println("1.Add Record");
        System.out.println("2.Display Record");
        System.out.println("3.Search a Record");
        System.out.println("4.Delete a record");
        Scanner sc = new Scanner(System.in);
        int will = sc.nextInt();
        if(will==1)
        {
            System.out.println("Enter the number you want to add in array :");
            int numin = sc.nextInt();

        }
        else if(will==2)
        {
            for(int i=0;i<size;i++)
            {
                System.out.print(arr1[i] + ",");
            }
            System.out.println("");
        }
        else if(will==3)
        {
            Lab3 ob = new Lab3();
            System.out.println("Enter the number you want to find in array :");
            int x = sc.nextInt();
            int result = ob.binsearch(arr1, 0, size - 1, x);
            if (result == -1) {
                System.out.println("Element Not Found");
            } else {
                System.out.println("Element is found at the index : " + result);
            }
        }
        else if(will==4)
        {
            int numout=sc.nextInt();
        }
        else
        {
            System.out.println("Wrong Input");
        }
    }

    int binsearch(int [] arr,int low,int high,int x)
    {
        if(high>low)
        {
            int mid=(low+(high-1))/2;
            if(arr[mid] == x)
            {
                return mid;
            }
            if(arr[mid]>x)
            {
                return binsearch(arr,low,mid-1,x);
            }
            else
            {
                return binsearch(arr,mid+1,high,x);
            }
        }
        else
        {
            return -1;
        }

    }
}