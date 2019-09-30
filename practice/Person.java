package com.code.practice;

public class Person {
    //attribute
    static String name;
    static String one;
    //method
    void printName(){
        System.out.println("Name ="+name);
    }
    static void printName(String name){
        System.out.println("hello");
    }

    static void printName(String name, String one){
        System.out.println("Name and one");
    }

    /*
    * Syntax of writing Methods
    * <Return type> Name_of_method(<number of parameters>){
    *       //statements
    * }
    *
    * 1. Without Return type and Without Parameter
    * void name_of_method(){
    *   //statements
    * }
    *
    * 2. With Return Type and Without Parameter
    *
    * int method2(){
    *   return 0;
    * }
    *
    *
    * */

}
