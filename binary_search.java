package com.company;

public class binary_search
{
    public static void main(String[] args)
    {
        binary_search ob = new binary_search();
        int [] arr = {2,3,4,10,40};
        int x=11;
        int n=arr.length;
        int result = ob.binsearch(arr,0,n-1,x);
        if(result==-1)
        {
            System.out.println("Element Not Found");
        }
        else
        {
            System.out.println("Element is found at the index : " + result);
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
