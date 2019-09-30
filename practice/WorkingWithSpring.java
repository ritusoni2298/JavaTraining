package com.code.practice;

public class WorkingWithSpring {
    public static void main(String[] args) {
        //Creating a String
        String str = "morning";

        String str1 = new String("morning");
        String str2 = "morning";
        String str3 = new String("morning");

        String str5 = "Morning";
        String str6 = "Morning";

        System.out.println(str);
        System.out.println(str1);

        // == and != comparators
        System.out.println(str == str1);//false
        System.out.println(str == str2);//true //false
        System.out.println(str1 == str3);//false
        System.out.println(str5 == str6);//true
        System.out.println(str5 == str); //false
        System.out.println("----------------------------");

        //.equals()

        System.out.println(str.equals(str1));

        //methods with String Class
        System.out.println("-----------------------");

        System.out.println((str.toUpperCase()) == str);
        System.out.println(str6.toLowerCase());

        //Array of Characters

        char[] a = str.toCharArray();

        for(int i =0;i<str.length();i++){
            System.out.print(a[i]+" ");
            if(a[i]=='r'){
                a[i]='s'-32;
            }
        }

        String st5 = String.valueOf(a);
        System.out.println(st5);

        //Weather a string is there in another string or not.(boolean value)
        String st= "This is a new session and we are learning about String class";
        String subst="is";
        System.out.println("-------------------------- ");
        System.out.println(st.contains(subst));

        //indexOf()

        System.out.println(st.indexOf('r'));
        //split
        String st4 = "ryan.amrutha.tushar";
        String[] star = st4.split("\\.");
        for(int i =0; i<star.length;i++){
            System.out.print(star[i]+"   ");
        }

        //special characters, we have in regular expr.:
        // < > - = ! ( ) { } [ ] \ + ?


        //join
        String cd = String.join("-",star);
        System.out.println(cd);

        String stg = st.substring(10,20);
        System.out.println(stg);

        //length
        int u = st.length();
        System.out.println(u);

        //remove the white spaces
        String p = "                        Hello   world                    ";

        //concat
        System.out.println(st.concat(str1)+"-----------");
        System.out.println(p.trim());

        System.out.println(st.replace("This","OKAY1"));

        //StringBuilder Class
        StringBuilder sb1 = new StringBuilder("String Builder");
        StringBuilder sb2 = new StringBuilder(st);

        char[] ar = {'j','a','v','a'};
        StringBuilder sb3 = new StringBuilder(String.valueOf(ar));

        sb3.append(" Hello");
        System.out.println(sb3);
        sb3.insert(2,"hello");
        System.out.println(sb3);

        sb3.replace(3,6,"Ryan");
        System.out.println(sb3);

        sb3.deleteCharAt(0);
        sb3.delete(2,6);
        System.out.println(sb3);
    }
}
