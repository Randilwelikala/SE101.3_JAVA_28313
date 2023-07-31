package com.mycompany.lab20230713;
import java.util.Scanner;
public class Lab20230713 
{

    public static void main(String[] args) 
    {
        //Question 01
        
        int n1,n2,div;
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter first number:");
            n1 = sc.nextInt();
            System.out.println("Enter second number:");
            n2 = sc.nextInt();
            div=n1/n2;
            System.out.println("Answer is "+div);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot divided by zero");
        }
        
        
        
    }
}
