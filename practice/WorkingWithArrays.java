package com.code.practice;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;

public class WorkingWithArrays {
    public static void main(String[] args) {
        //Array
        //collection of values

        //1. Primitive values in array
        //2. Objects in array

        //arr -> {1,2,3,4,5}
        //arr1 -> {r1,r2,r3,r4,r5}

        //Types of Array in terms of Dimension
        //1-D
        //multi-Dimensional

        //Create an Array
        //1. declaration
        //2. allocation
        //3. Initialization

        //Size -> static
        //1 dimensional Array
        //DECLARATION
        int a1[]; //correct
        int[] a2; //correct work fine

        //2-Dimensional Array
        int a3[][];
        int[][] a4;
        int[] a5[];

        //ALLOCATION
        a1 = new int[10];
        a3 = new int[3][3];

        //Declaration nd Allocation
        int[] i1 = new int[6];

        //INITIALIZATION

        for(int i=0;i<a1.length;i++){
            a1[i]=i*2;
        }

        a2 = new int[5];
        a2[0]=0;
//        a2[1]=1;
        a2[2]=4;
        a2[3]=5;

        //TRAVERSE THROUGH AN ARRAY
        //first
        for(int i =0;i<a1.length;i++){
            System.out.print(a1[i]+ "  ");
        }

        System.out.println(a1[2]);

        //second way
        for ( int i : a2) {
            System.out.print(i+" ");
        }
        System.out.println("-------------------- ");
        //2-D array
        for(int i =0; i<a3.length;i++){
            for(int j=0;j<a3[i].length;j++){ //[3][3]
                a3[i][j]=i+j;
            }
        }

        for (int[] i : a3 ) {
            for ( int j: i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        int[] i5 = {1,2,3,4,5,6};
        int[] i6 = new int[]{1,2,3,4,5,6,7};

        //Jagged Array
        int[][] i7 = new int[2][];
        int[][] i8 = new int[2][2];

        String s= "a";
        String s2= "b";
        String s3 = "c";
        String[] st1 = {"abc","def"};
        String st2[] ={s,s2,s3};
        StringBuilder[] sb1 = {
                new StringBuilder("abc"),
                new StringBuilder("def")
        };

        Person[] p1 = {
                new Person(),
                new Person(),
        };

        p1[0].name= "Dipali";
        p1[0].printName();

//        p1[2].name="Dipali";

        //resizable array
        //generics

        ArrayList<String> al1 = new ArrayList<>();
        al1.add("abc");
        al1.add("abc1");
        al1.add("abc2");
        al1.add("abc3");
        al1.add("abc4");
        System.out.println("----------------------------------------- ");
        for (String s9:
            al1 ) {
            System.out.println(s9);
        }
        System.out.println("----------------------------------------- ");
        //size
        int it= al1.size();
        System.out.println("size of Arraylist="+it);
        for (String s9:
                al1 ) {
            System.out.println(s9);
        }
        System.out.println("----------------------------------------- ");
        //add at certain index
        al1.add(2,"abc one and half");
        for (String s9:
                al1 ) {
            System.out.println(s9);
        }
        al1.set(5,"def5");
        for (String s9:
                al1 ) {
            System.out.println(s9);
        }
        System.out.println("----------------------------------------- ");

        al1.remove(3);

        for (String s9:
                al1 ) {
            System.out.println(s9);
        }
        System.out.println("----------------------------------------- ");

        //Wrapper Class


        //Integer
        //Double
        //Float
        //Short
        //Long
        //Byte
        //Boolean
        //Character

        //3 ways
        //1. Assignment(Autoboxing)
        Integer i0 = 12;
        //Immutable
        i0 = 14;
        
        //2. Contructors
        Integer iy1 = new Integer(13);

        //Constuctors
        Integer iy2 = new Integer("13");

        //3. method
        Double d4 = Double.valueOf(12.23);

        //Retrieving Primitive values from the Wrapper Classes

        int ik = i0.intValue();
        String sc = "123";
        int io = Integer.parseInt(sc);









          }
}
