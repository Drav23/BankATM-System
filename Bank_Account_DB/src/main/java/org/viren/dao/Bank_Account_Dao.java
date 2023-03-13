package org.viren.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.viren.dto.Account;
import org.viren.dto.Bank;

public class Bank_Account_Dao 
{
     EntityManagerFactory factory=Persistence.createEntityManagerFactory("Drav");
     EntityManager manager=factory.createEntityManager();
     EntityTransaction transaction=manager.getTransaction();
     
     
     public void saveBankAccount(Bank bank) 
     {
		transaction.begin();
		manager.persist(bank);
		transaction.commit();
		
	 }
     
     public void updateBank(int id, List<Account> ac) 
     {
		Bank bank=manager.find(Bank.class, id);
		List<Account> ac1=bank.getAc();
		ac1.addAll(ac);
		
		bank.setAc(ac1);
		
		manager.merge(bank);
		transaction.commit();
		
		
	}
}
