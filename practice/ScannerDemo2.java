package com.code.practice;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Integer");
        int sum =0, count =0;
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            sum = sum+num;
            count++;
        }
        int mean = sum/count;
        System.out.println("Mean:"+mean);

    }
}
