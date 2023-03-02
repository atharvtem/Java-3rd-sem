package com.company;

class MyEmployee
{
        private int id;
        private String name;

        public void setid(int i)
        {
            id = i;
        }
        public void getid()
        {
            System.out.println(id);
        }
        public void setname(String str)
        {
            name = str;
        }
        public void getname()
        {
            System.out.println(name);
        }
}

public class Tut40
{
    public static void main(String[] args)
    {
        MyEmployee suraj = new MyEmployee();
        suraj.setname("Suraj Patil");
        suraj.getname();
        suraj.setid(8);
        suraj.getid();
    }
}
