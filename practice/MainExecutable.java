package com.code.practice;


public class MainExecutable {
    public static void main(String[] args) {
        PunchInMachine pim1 = new PunchInMachine(1234,"8:00 am 24-sep");
        PunchInMachine pim2 = new PunchInMachine(1222);
        //actual parameter
//        PunchInMachine pim3 = new PunchInMachine();
        Calculator c1 = new Calculator();
        double d1 = c1.calAvg(12.0,23);
        System.out.println("Average is: "+d1);

        for(int i=0;i<10;i++) {
            int x = 10;
        }
    }
}
