package com.company;

public class T14
{
    public static void main(String[] args)
    {
        String Name = "Hey, Atharv Tembhurnikar. Watchu do'in? ";
        System.out.println(Name.length());
        System.out.println(Name.toLowerCase());
        System.out.println(Name.toUpperCase());
        System.out.println(Name.trim());
        System.out.println(Name.getBytes());
        System.out.println(Name.substring(30));     // 2 indexing se aage wali string print hogi
        System.out.println(Name.substring(0,15));            // indexing 0 to 15 printing
        System.out.println(Name.replace('a','b'));
        System.out.println(Name.startsWith("He"));
    }
}
