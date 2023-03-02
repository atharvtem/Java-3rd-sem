package com.company;
import java.util.*;

public class Sparse_matrix
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,k=0,c=0,n=0;
        int a[][]=new int[3][3];
        int sparse[][]=new int[9][3];
        int transpose[][]= new int[3][3];
        int[][] fastTranspose= new int[100][3];
        System.out.println("Enter the elements of the matrix");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(a[i][j]!=0)
                {
                    sparse[k][0]=i;
                    sparse[k][1]=j;
                    sparse[k][2]=a[i][j];
                    k++;c++;
                }
            }
        }
        System.out.println("Original matrix is:" );
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sparse matrix is");
        System.out.println();
        for(k=0;k<c;k++)
        {
            System.out.println(sparse[k][0]+" "+sparse[k][1]+" "+sparse[k][2]);
        }

        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                transpose[i][j]=a[j][i];
            }
        }
        System.out.println("Representation of Transpose Matrix(Simple Transpose)");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

        for(i=0;i<=2;i++)
        {
            for(j=0;j<c;j++)
            {
                if(sparse[j][1]==i)
                {
                    fastTranspose[n][0]=sparse[j][1];
                    fastTranspose[n][1]=sparse[j][0];
                    fastTranspose[n][2]=sparse[j][2];
                    n++;
                }
            }
        }

        System.out.println("Representation of Transpose Matrix(Fast Transpose)");
        for(i=0;i<c;i++){
            for(j=0;j<3;j++)
            {
                System.out.print(fastTranspose[i][j]+" ");
            }  System.out.println();
        }
        System.out.println();
    }
}