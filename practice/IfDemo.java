package com.code.practice;

public class IfDemo {
    public static void main(String[] args) {
//        int age = 12;
//        boolean check =false;
////        if(age>=18){
////            System.out.println("You are eligible to vote");
////        }else{
////            System.out.println("No, you are not allowed to vote.");
////        }
//
//        if(age>=18)
//            check =true;
//        else
//            check=false;
//
//        if(check)
//            System.out.println("You can vote");
//        else
//            System.out.println("You can't vote");
//            System.out.println("Thank you");

        //if-else-if ladder

//        int num =0;
//
//        if(num>0){
//            System.out.println("The number is Positive.");
//        }else if(num<0){
//            System.out.println("The number is Negative");
//        }else{
//            System.out.println("The number is Zero");
//        }


        //leap year:
        //1. If it is divisible by 4 then it should not be divisible by 100. then It is leap year
        //2. If it is divisible by 100. then true

        int year = 2000;
        boolean check =false;

        //% ==> used for getting the remainder
        if((year%4==0 && year%100!=0)  || year%400==0){
            check = true;
        }
        if(check){
            System.out.println("Year is leap Year");
        }else{
            System.out.println("Year is not a leap year");
        }

        //To check that the person can donate the blood or not.

        int age =24;
        int wt= 45;

        if(age>18){
            if(wt>50){
                System.out.println("You can Donate blood");
            }else{
                System.out.println("You can't donate blood");
            }
        }else{
            System.out.println("You can't donate blood");
        }

    }
}
