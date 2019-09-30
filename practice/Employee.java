package com.code.practice;

public class Employee {

    //Attributes //instance variable
    int empid;
    double salary;
    String name;

    static int locker; //class Variable

    //methods
    void printDetails(){
        System.out.println("Emp id:"+empid);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
        locker =10;
    }

    void setEmpid(int id){
        int a; //Local Variables
        empid = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) { //Method Parameter/Variable
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getEmpid(){
        return empid;
    }

    double salaryWithBonus(double salary, double bonus){
        return salary+bonus;
    }


}
