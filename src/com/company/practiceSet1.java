package com.company;
import java.util.*;

public class practiceSet1 {
    public static void main(String[] args) {
        float a=7/4.0f*9/2.0f;
        System.out.println(a);

        char grade='B';
        //cast
        grade=(char)(grade+8);
        System.out.println(grade);

        //decrypting
        grade=(char)(grade-8);
        System.out.println(grade);

        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        System.out.println(p>8);

       int v=8;
       int u=4;
       int s=5;
       float k=((v*v)-(u*u))/(2*a*s);
       System.out.println(k);

       int x=7;
       float y=((7*49)/7)+(35/7);
       System.out.println(y);

    }
}
