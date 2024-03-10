package com.company;
import java.util.*;

public class Strings {
    public static void main(String[] args) {
//        String name=new String("Name");
        String name="Name";
        System.out.println(name);

        int value=name.length();
        System.out.println(value);

        String lstring=name.toLowerCase();
        System.out.println(lstring);

        String nonTrimmedString="  Name    ";
        System.out.println(nonTrimmedString);

        String trimmedString=nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(3));
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,3));

        System.out.println(name.replace('a','s'));
        System.out.println(name.replace("me","p"));

        System.out.println(name.startsWith("abc"));
        System.out.println(name.charAt(1));
        System.out.println(name.indexOf("me"));



        int a=6;
        float b = 5.78F;
        System.out.printf("The value of a is %d and value of b is %f",a,b);

       Scanner sc=new Scanner(System.in);
       String st=sc.nextLine();
       System.out.println(st);


    }
}
