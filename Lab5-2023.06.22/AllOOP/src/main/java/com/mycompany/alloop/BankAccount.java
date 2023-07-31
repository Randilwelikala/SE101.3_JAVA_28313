package com.mycompany.alloop;
abstract class BankAccount 
{
    private int accountNumber;
    private double balance;
    
    public void setAccountNumber(int num)
    {
        accountNumber = num;
    }
    public void setBalance(double bal)
    {
        balance = bal;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public double getBalance()
    {
        return balance;
    }
    
    
    public abstract double calculateInterest();
  
    
}
