package com.luv2code.springdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MemberShipDao {
	
	public void addAccount()  {
		System.out.println(getClass() + " : DO SOME STUFFS: ADD MEMBERSHIP ACCOUNT");
	}

	
	public boolean deleteMember() {
		System.out.println(getClass() + " Delete some inactive memebers");
		
		return true;
	}
}
