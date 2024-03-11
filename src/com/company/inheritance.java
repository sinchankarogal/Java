package com.company;

class Base {
    int a1;
    int a2;

    public Base(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public int geta1() {
        return a1;
    }

    public int geta2() {
        return a2;
    }
}

class Derived extends Base {

    int b1;
    int b2;

    public Derived(int a1, int a2, int b1, int b2) {
        super(a1, a2);
        this.b1 = b1;
        this.b2 = b2;
    }

    public int getb1() {
        return b1;
    }

    public int getb2() {
        return b2;
    }
}

public class inheritance {
    public static void main(String[] args) {
        Derived derivedObj = new Derived(1, 2, 3, 4);
        System.out.println("a1: " + derivedObj.geta1());
        System.out.println("a2: " + derivedObj.geta2());
        System.out.println("b1: " + derivedObj.getb1());
        System.out.println("b2: " + derivedObj.getb2());
    }
}
