package com.company;
import java.util.Scanner;

public class BubbleSort2 
{
    static void bubblesort(int arr[], int n)
    {
        int i,j,temp;
//        boolean swapped;
        for(i=0;i<n;i++)
        {
//            swapped = false;
            for(j=0;j<n;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
//                swapped=true;
            }
//            if(swapped==false)
//            {
//                break;
//            }
        }
    }
    static void printarray(int arr[], int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
            int n,num;
            Scanner sc = new Scanner(System.in);
            n=sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                num=sc.nextInt();
                arr[i]=num;
            }
            bubblesort(arr,n);
        System.out.println("Sorted Array : ");
        printarray(arr,n);
    }
}
