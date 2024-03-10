package com.company;

class Employee{
    int id;
    String name;
    int Salary;
    public void printDetails(){
        System.out.println("My id is"+id);
        System.out.println("and my name is "+name);
    }
    public int getSalary(){
        return Salary;
    }
}
public class custom_class {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.id=1;
        e1.name="abc";
        e1.Salary=10000;
//        System.out.println(h.id);
//        System.out.println(h.name);
        e2.id=2;
        e2.name="xyz";
        e2.Salary=12000;
        e1.printDetails();
        int salary=e1.getSalary();
        System.out.println(salary);
        e2.printDetails();
    }
}
