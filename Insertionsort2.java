package com.company;
import java.util.Scanner;

public class Insertionsort2
{
    public static void isort(int arr[],int n)
    {
        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void printarray(int arr[],int n)
    {
        System.out.println("Sorted array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int arr [] = new int[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter Number " + (i+1));
            arr[i]=sc.nextInt();
        }
        isort(arr,num);
        printarray(arr,num);
    }
}
