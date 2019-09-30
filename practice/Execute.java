package com.code.practice;

public class Execute {
    public static void main(String[] ar) {
        System.out.println("Hello World");

        Phone ph = new Phone();
        //byte
        byte b = 12;
        b=13;
        //short
        short s= 9999;
        //int
        int i = 12345;
        //long
        long l = 23456;
        //float
        float f = 1.2F+123;
        //double
        double d = 2.45;
        //char
        char ch = 'a';
        //boolean
        boolean bl = false;

        Phone ph1 = new Phone();
        ph1.sendMsg();
        ph1.company="Samsung";

        //operators
        //assignment
        int a=40, b1=45;

        //arithmetic Operators
        double d1=12.5,d2=34.8,res;

        res = d1+d2;
        System.out.println("Addition:"+res);

        res=d2-d1;
        System.out.println("Subtraction:"+res);

        res=d1*d2;
        System.out.println("Mutiply:"+res);

        res=d1/d2;
        System.out.println("divide:"+res);

        res=b1%a;
        System.out.println("Remainder: "+res);

        //Unary Operators

        int x=15;
        int p;
        p=x++;//postfix p=x, x=x+1
        System.out.println("p="+p+"x="+x);
        p=++x;//prefix x=x+1, p=x
        System.out.println("p="+p+"x="+x);

        //comparison Operators

        boolean bool = a==b1;
        System.out.println(bool);
        bool = a!=b1;
        System.out.println(bool);
        bool = a>b1;
        System.out.println(bool);
        bool = a<b1;
        System.out.println(bool);
        bool = a<=b1;
        System.out.println(bool);

        //ternary operator

        int age=-10;
        String ageprecision= age<0 ? "Not Okay" : "Okay";
        System.out.println(ageprecision);

        //logical Operator
        //bitwise Operator
        //instanceof Operator

        bool = ph1 instanceof Phone;
        System.out.println(bool);

        int xc=20,xv=30;
        double dv= xv/2.0;
        System.out.println(dv);
//        Calculator c1 =new Calculator();
//
//        double d21 = c1.calAverage(12.23,17.23,14.35);
//        System.out.println(d21);
//
    }
}
