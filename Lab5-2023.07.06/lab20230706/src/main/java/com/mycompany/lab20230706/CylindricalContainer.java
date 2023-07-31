package com.mycompany.lab20230706;

public class CylindricalContainer extends Container
{
    private double Height,Radius;
    protected static final double PI=3.14159;
    public void CylindricalContainer(double R,double H)
    {
        Height=H;
        Radius=R;      
    }
   @Override
    public double volume()
    {
       double volume = PI*Radius*Radius*Height;
        return volume;
                
    }
    
}
