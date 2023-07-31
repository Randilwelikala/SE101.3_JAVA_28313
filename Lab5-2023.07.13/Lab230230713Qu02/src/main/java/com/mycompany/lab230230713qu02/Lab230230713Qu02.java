package com.mycompany.lab230230713qu02;
public class Lab230230713Qu02 
{

    public static void main(String[] args)
    {
        //Question 02
        int[] array={10,11,12,13,14,15};
        try
        {
            
            
                array[7]=12;                
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Out of array boundry");
        }
        finally
        {
            for(int i=0;i<array.length;i++)
            {
                System.out.println(""+array[i]);                
            }
        }
                
    }
}
