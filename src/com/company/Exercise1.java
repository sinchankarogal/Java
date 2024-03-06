package com.company;
import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        float total = 100 * 5;
        System.out.println("Marks");
        Scanner sc = new Scanner(System.in);

        System.out.println("Networks");
        float a = sc.nextFloat();

        System.out.println("DSA");
        float b = sc.nextFloat();

        System.out.println("COA");
        float c = sc.nextFloat();

        System.out.println("OS");
        float d = sc.nextFloat();

        System.out.println("GTLA");
        float e = sc.nextFloat();

        float sum = a + b + c + d + e;
        System.out.println("Sum " + sum);

        float percentage = (sum / total) * 100;
        System.out.println("Percentage " + percentage);
    }
}