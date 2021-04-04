package com.luv2code.springdemo.dao;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Account;

@Component
public class AccountDao {
	
	private String name;
	private String serviceAccount;
	
	
	public List<Account> findAccounts(boolean condExc) {
		
		if(condExc) {
			throw new RuntimeException("no soop for you!!!");
		}
		

		List<Account> accounts = new ArrayList<Account>();
		
		Account temp1 = new Account("jhon", "gold");
		Account temp2 = new Account("cristiano", "diamond");
		Account temp3 = new Account("lionel", "gold");
		Account temp4 = new Account("jack", "bronse");
		Account temp5 = new Account("black", "bronse");
		
		accounts.add(temp1);
		accounts.add(temp2);
		accounts.add(temp3);
		accounts.add(temp4);
		accounts.add(temp5);
		
		return accounts;
	}
	
	public void addAccount(Account account , boolean vipAcc)  {
		System.out.println(getClass() + " DO SOME DB stuffs: ADD Accont Dao");
	}
	
	public Boolean updateAccount() {
		System.out.println(getClass() + " Update some db stuffs: UPDATE ACCOUNT DAO");
		return false;
	}

	public String getName() {
		System.out.println(getClass() + " in getName");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + " in setName");
		this.name = name;
	}

	public String getServiceAccount() {
		System.out.println(getClass() + " in getServiceAccount");
		return serviceAccount;
	}

	public void setServiceAccount(String serviceAccount) {
		System.out.println(getClass() + " in setServiceAccount");
		this.serviceAccount = serviceAccount;
	}
	
	

}
