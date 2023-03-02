package com.company;
import java.util.Scanner;

public class practice1_transpose
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr1 [][];
        arr1 = new int [4][4];
        for (int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.printf("enter element (%d,%d)",i+1,j+1);
                arr1[i][j]=sc.nextInt();
            }
        }
        int arr2 [][];
        arr2= new int [4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr2[i][j]=arr1[j][i];
            }
        }
        System.out.print("\nPrevious array:\n");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(arr1[i][j]!=0)
                {
                    System.out.printf("(%d,%d)=%d\n",i+1,j+1,arr1[i][j]);
                }
            }
        }
        System.out.print("\nNew Array:\n");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(arr2[i][j]!=0)
                {
//                    System.out.printf("(%d,%d)=%d\n",i+1,j+1,arr2[i][j]);
                    System.out.print(arr2[i][j]);
                }
            }
        }

    }
}
