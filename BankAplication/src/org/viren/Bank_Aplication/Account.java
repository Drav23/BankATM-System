package org.viren.Bank_Aplication;


public class Account 
{
//	c=Customer
     String cname;
     long cNumber;
     String cDoB;
     String cpin;
     double cmoney;
     
     
	public Account(String cname, long cNumber, String cDoB, String cpin, double cmoney) 
	{
	
		this.cname = cname;
		this.cNumber = cNumber;
		this.cDoB = cDoB;
		this.cpin = cpin;
		this.cmoney = cmoney;
	}


	public void AccountDetail()
	{
		System.out.println(cname);
		System.out.println(cNumber);
	    System.out.println(cDoB);
	    System.out.println(cpin);
	    System.out.println(cmoney);
	}
     
}
