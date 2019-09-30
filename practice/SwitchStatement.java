package com.code.practice;

public class SwitchStatement {
    public static void main(String[] args) {
        //for loop

        //for(initialization ;condition ; increment ){
            //statements
    //}
        for(int i=0; i<10 ;i++){
            System.out.println("i="+i);
            if(i==6){
                System.out.println("Coming out of the loop");
                continue;
            }
            System.out.println("i="+i);
        }
        System.out.println("Out of Loop");
    }
}
