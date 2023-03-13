package org.viren.Bank_Aplication;

import java.util.Scanner;

public class Bank 
{
      String bName;
      String bLoc;
      String b_IFSC_Code;
      
      Account a;
      
	public Bank(String bName, String bLoc, String b_IFSC_Code) {
		this.bName = bName;
		this.bLoc = bLoc;
		this.b_IFSC_Code = b_IFSC_Code;
	}
	
	public void bankDetails()
	{
		System.out.println("The Bank name :"+bName); 
		System.out.println("The Brach name:"+bLoc);
		System.out.println("The IFSC Code:"+b_IFSC_Code);
		if(a!=null)
		{
			System.out.println(a.cname);
			System.out.println(a.cNumber);
		    System.out.println(a.cDoB);
		    System.out.println(a.cpin);
		    System.out.println(a.cmoney);
		}
		else {
			System.out.println("Please Create Account First to Check Account Details");
		}
	}
	public void creaateAccount(Account a)
	{
		a.AccountDetail();
		if(this.a==null)
		{
			this.a=a;
			System.out.println("Account Successfully Created");
		}
		else {
			System.out.println("Already Account iis existing");
		}
		
		
	}
	
	public void deposite(long aNumber, double money)
	{ 
		
		if(a.cNumber==aNumber)
		{ 
			if(money!= 0) {
			a.cmoney=a.cmoney+money;
			System.out.println("Deposite Amount: "+money);
			System.out.println("Total Amount: "+a.cmoney);
			}
		else
		{
			System.out.println("Enter Valide Amount to add in account");
		}
		}
		else
		{
			System.out.println("Enter Valide Account Number");
		}
	}
	public void withdraw(long cNumber, double money)
	{
		
		if(a.cNumber==cNumber)
		{ 
			if(a.cmoney>=money ) {
			a.cmoney=a.cmoney-money;
			System.out.println("Withdrawl Amount: "+money);
			System.out.println("Total Withdrawl Amount: "+a.cmoney);
			}
		else
		{
			System.out.println("Enter Valide Amount to remove from account");
		}
		}
		else
		{
			System.out.println("Enter Valide Account Number");
		}
	}
	
	public void Delete()
		{
			this.a=null;
			System.out.println("Account has been Deleted");
		}
      
      
}































