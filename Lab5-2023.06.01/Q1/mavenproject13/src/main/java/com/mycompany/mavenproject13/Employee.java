package com.mycompany.mavenproject13;
public class Employee 
{
    private int empID;
    private String empName, empDesignation;
     
    
    public void setempdetails(int empID,String empName,String empDesignation)
    {
        this.empID=empID;
        this.empName=empName;
        this.empDesignation=empDesignation;
    }
    
    public int getempID()
    {
        return empID;
    }
    public String getempName()
    {
        return empName;
    }
    public String getempDesignation()
    {
        return empDesignation;
    }
        
}
