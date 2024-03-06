package com.company;
import java.util.*;

public class input {
    public static void names(String name){
        System.out.println(name);
        return;
    }
    public static int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        String name=s.next();
        names(name);

        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();

        int sum=add(a,b);
        System.out.println(sum);

    }
}
