package com.code.practice;
import java.util.Scanner;

public class ScannerDemo {

        public static void task2_8(){
            Scanner scanner= new Scanner(System.in);
            try{
                String c = scanner.next(".");
                String pattern = "RANDOMrandom";
                if(pattern.contains(c)){
                    System.out.println("FOUND");
                }
                else{
                    System.out.println("NOT FOUND");
                }
            }catch (java.util.InputMismatchException e){
                return;
            }
        }

    public static void main(String[] args) {
        task2_8();
    }
}
