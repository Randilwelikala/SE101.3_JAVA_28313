package com.mycompany.question05_2;
import java.util.Scanner;
public class Question05_2 
{

    public static void main(String[] args)
    {   
        char mark='A';
           
        if (mark=='A')
        {
            System.out.println("Excellent!");            
        }
        else if (mark=='D')
        {
            System.out.println("You passed");            
        }
        else if (mark=='F')
        {
            System.out.println("Better try again");            
        }
        else
        {
            System.out.println("Inavalid grade");
        }
        System.out.println("Your grade is "+mark);
                
        
    }
}
