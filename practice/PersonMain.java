package com.code.practice;

public class PersonMain {
    int a=10;

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empid=100;
        e1.name="Chintan";
        e1.salary= 20000;
        double bonus = 5000;
        e1.printDetails();
        double d1= e1.salaryWithBonus(e1.salary,bonus);
        System.out.println("Salary with Bonus ="+d1);

        e1.setEmpid(200);
        e1.printDetails();
        int i= e1.getEmpid();
        System.out.println("Employee Id ="+i);

    }
}
