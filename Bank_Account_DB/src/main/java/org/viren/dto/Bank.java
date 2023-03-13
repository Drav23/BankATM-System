package org.viren.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank
{
	@Id
     private String b_IFSC;
     private String b_Name;
     private String b_Branch;
     private String b_Email;
     
     @OneToMany(cascade = CascadeType.ALL)
     List<Account> ac;

	public String getB_IFSC() {
		return b_IFSC;
	}

	public void setB_IFSC(String b_IFSC) {
		this.b_IFSC = b_IFSC;
	}

	public String getB_Name() {
		return b_Name;
	}

	public void setB_Name(String b_Name) {
		this.b_Name = b_Name;
	}

	public String getB_Branch() {
		return b_Branch;
	}

	public void setB_Branch(String b_Branch) {
		this.b_Branch = b_Branch;
	}

	public String getB_Email() {
		return b_Email;
	}

	public void setB_Email(String b_Email) {
		this.b_Email = b_Email;
	}

	public List<Account> getAc() {
		return ac;
	}

	public void setAc(List<Account> ac) {
		this.ac = ac;
	}

	@Override
	public String toString() {
		return "Bank [b_IFSC=" + b_IFSC + ", b_Name=" + b_Name + ", b_Branch=" + b_Branch + ", b_Email=" + b_Email
				+ ", ac=" + ac + "]";
	}
     
     
}
