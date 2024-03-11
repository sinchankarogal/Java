package com.company;

class Employees{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
public class Newclass {
    public static void main(String[] args) {
        Employees abc=new Employees();
        abc.setName("Harry");
        System.out.println(abc.getName());
    }

}
