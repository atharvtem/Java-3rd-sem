package com.company;

public class Tut28_MultidimentionalArrays
{
    public static void main(String[] args)
    {
        int [] [] flats;
        flats = new int[5][2];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[2][0]=301;
        flats[2][1]=302;
        flats[3][0]=401;
        flats[3][1]=402;
        flats[4][0]=501;
        flats[4][1]=502;
        for(int i=0;i < flats.length;i++)
        {
            for(int j=0;j < flats.length;j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
