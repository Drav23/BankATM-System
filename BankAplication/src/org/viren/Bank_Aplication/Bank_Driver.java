package org.viren.Bank_Aplication;

import java.util.Scanner;

public class Bank_Driver {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Bank Name:");
		String bName=sc.next();
		
		System.out.println("Enter Bank Location:");
		String bLoc=sc.next();
		
		System.out.println("Enter Bank IFSC Code:");
		String b_IFSC_Code=sc.next();
		
		Bank b=new Bank(bName, bLoc, b_IFSC_Code);
		System.out.println("<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=");
		boolean option=true;
		while(option)
		{
			
			System.out.println("1 : Create Account ");
			System.out.println("2 : Check Youre Details ");
			System.out.println("3 : Deposite Money ");
			System.out.println("4 : Withdrawl Money ");
			System.out.println("5 : Delete Account ");
			System.out.println("6 : Exite ");
			System.out.println("<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=");
			
			int choice =sc.nextInt();
			
			switch (choice) {
			case 1:
			{
				System.out.println("Enter Account Holder Name: ");
				String cname=sc.next();
				
				System.out.println("Enter Account Number: ");
				long cNumber=sc.nextLong();
				
				System.out.println("Enter Holder Date Of Birth: ");
				String cDoB=sc.next();
				
				System.out.println("Enter Account Password: ");
				String cpin=sc.next();
				
				System.out.println("Enter Money: ");
				double cmoney=sc.nextDouble();
				
				b.creaateAccount(new Account(cname, cNumber, cDoB, cpin, cmoney));
				System.out.println("<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=");
			}
				
			break;
			
			case 2:
			{
				b.bankDetails();
				System.out.println("<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=");
				System.out.println("\n");
			}
			break;
			
			case 3:
			{
				System.out.println("Enter Account Number To Deposite money:");
				long cNumber1=sc.nextLong();
				
				System.out.println("Enter The Money you Want to Deposite:");
				double cmoney1=sc.nextDouble();
				
				b.deposite(cNumber1, cmoney1);
				System.out.println("<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=");
				System.out.println("\n");
			}
			break;
			
			case 4:
			{
				System.out.println("Enter Account Number To Withdrawl money:");
				long cNumber1=sc.nextLong();
				
				System.out.println("Enter The Money you Want to Withdrawl:");
				double cmoney1=sc.nextDouble();
				
				b.withdraw(cNumber1, cmoney1);
				System.out.println("<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=");
				System.out.println("\n");
			}
			
			break;
			
			case 5:
			{
				b.Delete();
				System.out.println("<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=<=");
				System.out.println("\n");
			}
			break;
			
			case 6:
			{
				System.out.println(" Thank you using" + bName);
				System.out.println("HAVE A GOOD DAY....)!!!"); 
				option = false;
			}
			break;

			default:
			{
				System.out.println("Enter your Valide Choice");
				break;
			}
				
			}
		}

	}

}























