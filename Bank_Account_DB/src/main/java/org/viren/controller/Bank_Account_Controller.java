package org.viren.controller;

import java.util.ArrayList;
import java.util.List;

import org.viren.dao.Bank_Account_Dao;
import org.viren.dto.Account;
import org.viren.dto.Bank;

public class Bank_Account_Controller {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		bank.setB_Name("SBI");
		bank.setB_Email("sbi@gmail.com");
		bank.setB_Branch("Dom");
		bank.setB_IFSC("SBI111120");

		Account ac =new Account();
		ac.setA_Number(1234);
		ac.setA_Name("Virendra");
		ac.setA_Email("viren@gmail.com");
		ac.setA_Address("Dom");
		ac.setA_Money(1000);
		
		Account ac1=new Account();
		ac1.setA_Number(1245);
		ac1.setA_Name("Vinod");
		ac1.setA_Email("vinod@gmail.com");
		ac1.setA_Address("Diva");
		ac1.setA_Money(500);
		
		List<Account> b=new ArrayList<Account>();
		b.add(ac);
		b.add(ac1);
		
		bank.setAc(b);
		
		Bank_Account_Dao dao = new Bank_Account_Dao();
		dao.saveBankAccount(bank);
	}

}
