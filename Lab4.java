package com.company;

public class Lab4
{
    static int max(int m, int n)
    {
        return (m>n)?m:n;
//        return Math.max(m, n);
    }
    static int[] add(int [] A, int [] B, int m, int n)
    {
        int size = max(m,n);
        int [] summation;
        summation = new int[size];
        for(int i=0; i<m;i++)
        {
            summation[i]+=A[i];
        }
        for(int i=0;i<n;i++)
        {
            summation[i]+=B[i];
        }
//        if (m >= 0) System.arraycopy(A, 0, summation, 0, m);
//        if (n >= 0) System.arraycopy(B, 0, summation, 0, n);
        return summation;
    }
    static void PrintPoly (int[] Poly, int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print(Poly[i]);
            if (i != 0)
            {
                System.out.print("x^n" + i);
            }
            if(i!=n-1)
            {
                System.out.print(" " + " + ");

            }
        }

    }
    public static void main(String[] args)
    {
        int[] A = {5,0,10,6};
        int[] B = {1,2,4};
        int m = A.length;
        int n = B.length;
        System.out.print("1st polynomial is : ");
        PrintPoly(A,m);
        System.out.println("");
        System.out.print("Second Polynomial is :");
        PrintPoly(B,n);
        int [] arr;
        arr = add (A,B,m,n);
        int size = max(m,n);
        System.out.println("");
        System.out.print("Sum of polynomial :");
        PrintPoly(arr,size);
    }
}
