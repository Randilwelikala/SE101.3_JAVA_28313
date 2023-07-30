package com.mycompany.practicalpart01;
public class Item 
{
    private int location;
    private String description;
    
    public void getitem(int location,String description)
    {
        this.location=location;
        this.description=description;
    }
    
    public void setlocation(int location)
    {
        this.location=location;
                
    }
    public void setdescription(String description)
    {
        this.description=description;
    }
    public int getlcation()
    {
        return location;
    }
    public String getdescription()
    {
        return description;
    }
    
}
