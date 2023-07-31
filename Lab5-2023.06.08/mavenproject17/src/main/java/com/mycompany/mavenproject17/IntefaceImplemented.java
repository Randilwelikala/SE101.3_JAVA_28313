package com.mycompany.mavenproject17;
public class IntefaceImplemented implements MyFirstInterface  
{
    public void display()
    {
    System.out.println("The value of x is "+x);
    }
     //3)We cannot change the value of x because it is declared in interface then value of x become public static final.
    
    
}
