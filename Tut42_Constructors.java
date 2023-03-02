package com.company;
import java.util.Scanner;

class MyBestEmployee
{
    static int id;
    static String name;
    public MyBestEmployee(String myName,int in_id){
        id=in_id;
        name=myName;
    }
    public static String getname(){return name;}
    public void setname(String n){
        name=n;};
    public void setID(int i){
        id=i;}
    public static int getID() {return id;}
};

public class Tut42_Constructors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int a=sc.nextInt();
        System.out.println("Enter Name :");
        String b=sc.next();
        MyBestEmployee emp = new MyBestEmployee(b,a);
        System.out.println("Output: ");
        System.out.println(MyBestEmployee.getID());
        System.out.println(MyBestEmployee.getname());
    }
}
