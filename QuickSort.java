package com.company;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //creating an array by taking elements from the user
        System.out.println("Enter length of array : ");
        int n=sc.nextInt();
        int[] ar= new int[n];
        System.out.println("Enter "+ar.length+" integer values");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        Sort(ar,0,n-1);
        System.out.println("Sorted Array: ");
        disp(ar,n);
    }
    public static void swap(int arr[],int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int arr[],int l,int h){
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if (arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return(i+1);
    }
    public static void Sort(int arr[],int l,int h){
        if(l<h){
            int p=partition(arr,l,h);
            Sort(arr,l,p-1);
            Sort(arr,p+1,h);
        }
    }
    public static void disp(int arr[],int n){
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
};