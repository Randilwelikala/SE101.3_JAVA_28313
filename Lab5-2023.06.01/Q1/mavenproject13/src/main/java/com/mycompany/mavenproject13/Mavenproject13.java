package com.mycompany.mavenproject13;
public class Mavenproject13
{

    public static void main(String[] args) 
    {
            Employee e1= new Employee();
            e1.setempdetails(1234, "John", "officer");
            System.out.println("Employee ID: "+e1.getempID());
            System.out.println("Employee name: "+e1.getempName());
            System.out.println("Employee designation: "+e1.getempDesignation());
    }
}
