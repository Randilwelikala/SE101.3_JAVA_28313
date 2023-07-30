package com.mycompany.question6;
public class Question6 
{

    public static void main(String[] args) 
    {
        class TestEnhanceForLoop 
        {
   	public static void mains(String args[])
            {
     	 int [] numbers = {10, 20, 30, 40, 50};
      		for(int x : numbers )
                {
        			 System.out.print( x );
         			System.out.print(",");
      		}
	 System.out.print("\n");
      	String [] names ={"James", "Larry", "Tom", "Lacy"};
      		for( String name : names ) 
                {
        		 	System.out.print( name );
         			System.out.print(",");

                }
            }
        }
    }
}
