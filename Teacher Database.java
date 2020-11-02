package com.company;

import java.util.Scanner;

class database
{
    int code_name;
    void data()
    {
        System.out.println("welcome");
        System.out.println("Enter code ");
    }
}
class teacher extends database
{
    int tcode=180;
    void info()
    {
        System.out.println("Welcome to teacher section");
    }
}
class officer extends database
{
    int ocode=190;
    void offinfo()
    {
        System.out.println("welcome to officer section");
    }
}
class typist
{
    void inform()
    {
        System.out.println("Welcome to Typist section");
    }
}
class staff
{
    public static void main(String args[])
    {
        database d=new database();
        teacher t=new teacher();
        officer o=new officer();
        typist ty=new typist();
        d.data();
        int code_name;
        Scanner scanner=new Scanner(System.in);
        code_name=scanner.nextInt();
        switch (code_name)
        {
            case 101:
               // System.out.println("Welcome to Teacher Section");
                t.info();
                System.out.println("1-Maths");
                System.out.println("2-Physics");
                System.out.println("3-Chemistry");
                System.out.println("4-English");
                System.out.println("5-Hindi");
                byte select;
                Scanner scanner1=new Scanner(System.in);
                select=scanner1.nextByte();
                switch (select)
                {
                    case 1:
                        System.out.println("Mr.Deepak Rawat(Msc-Maths)");
                        break;
                    case 2:
                        System.out.println("Mrs Asha Sharma(Msc-physics)");
                        break;
                    case 3:
                        System.out.println("Mr Sandeep Dubey(Msc-chemisrty(Net))");
                        break;
                    case 4:
                        System.out.println("Mrs Nisha Goyal(MA-English)");
                        break;
                    case 5:
                        System.out.println("Mrs Jasspreet Kaur(Ctet)");
                        break;
                    default:
                        System.out.println("Chose valid subject");
                }
                break;
            case 102:
                o.offinfo();
                System.out.println("Press key to see list of Officer ");
                System.out.println("1:Administrative/Chancollor ");
                System.out.println("2:Security officer");
                System.out.println("3:Sports officer");
                System.out.println("4:Acadmic officer");
                byte off;
                Scanner scanner2=new Scanner(System.in);
                off=scanner2.nextByte();
                switch (off)
                {
                    case 1:
                        System.out.println("Dr Satnam Singh Sandhu(Phd)");
                        break;
                    case 2:
                        System.out.println("Mr Virender Singh Chowhan(Ex-Amry)");
                        break;
                    case 3:
                        System.out.println("Mr Gurvinder Singh(Gold Medalist)");
                        break;
                    case 4:
                        System.out.println("Mr R.S Bawa(Vice chanchlor)");
                        break;
                    default:
                        System.out.println("chose valid option");
                }
                break;
            case 103:
                 ty.inform();
                System.out.println("Press key to see list of Typist");
                System.out.println("1:Regular typist");
                System.out.println("2:Casual typist");
                byte type;
                Scanner scanner3=new Scanner(System.in);
                type=scanner3.nextByte();
                switch (type)
                {
                    case 1:
                        System.out.println("Mr Rajeev kumar With Fixed Salary");
                        break;
                    case 2:
                        System.out.println("Mr Ajay and Vijay are casual with daily wages of 1000/Rs ");
                        break;
                    default:
                        System.out.println("chose valid option");
                }

                break;
            default:
                System.out.println("Invalid code");
        }
    }
}
