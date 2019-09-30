package com.code.practice;

public class Calculator {

    public double calAvg(int i1, int i2){
        return (i1+i2)/2;
    }

    public double calAvg(double i1, double i2){
        return (i1+i2)/2;
    }

    public double calAvg(int i1, double i2){
        return (i1+i2)/2;
    }

    public double calAvg(double i1, int i2){
        return (i1+i2)/2;
    }
    //overloading
    /*
    * 1. the name of the method is going to be the same.
    * 2. the method parameters type must be different.
    * 3. the method overloading do not get affected by the return type and access modifier of the method.(these might and might not get changed)
    * */

}
