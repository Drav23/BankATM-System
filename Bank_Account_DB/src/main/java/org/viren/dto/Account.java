package org.viren.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account 
{
	@Id
     private long a_Number;
     private String a_Name;
     private String a_Address;
     private String a_Email;
     private double a_Money;
     
     
	public long getA_Number() {
		return a_Number;
	}
	public void setA_Number(long a_Number) {
		this.a_Number = a_Number;
	}
	public String getA_Name() {
		return a_Name;
	}
	public void setA_Name(String a_Name) {
		this.a_Name = a_Name;
	}
	public String getA_Address() {
		return a_Address;
	}
	public void setA_Address(String a_Address) {
		this.a_Address = a_Address;
	}
	public String getA_Email() {
		return a_Email;
	}
	public void setA_Email(String a_Email) {
		this.a_Email = a_Email;
	}
	public double getA_Money() {
		return a_Money;
	}
	public void setA_Money(double a_Money) {
		this.a_Money = a_Money;
	}
	@Override
	public String toString() {
		return "Account [a_Number=" + a_Number + ", a_Name=" + a_Name + ", a_Address=" + a_Address + ", a_Email="
				+ a_Email + ", a_Money=" + a_Money + "]";
	}
     
	
     
}
