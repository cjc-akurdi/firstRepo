package com.serviceImpl;

import java.util.Scanner;

import com.model.Account;
import com.service.RBI;

public class SBI implements RBI{

	Scanner sc=new Scanner(System.in);
	
     Account ac = new Account();
	
	@Override
	public void createAccount() {
		
		System.out.println("Enter Account Holder No Here");
		ac.setAcno(sc.nextInt());
		System.out.println("Enter Account Holder Name Here");
		ac.setAcname(sc.next());
		System.out.println("Enter Account Holder Address Here");
		ac.setAddress(sc.next());
		System.out.println("Enter Account Holder Mobile NO Here");
		ac.setMobileno(sc.nextLong());
		System.out.println("Enter Account Holder Adhar No Here");
		ac.setAdharno(sc.nextLong());
		System.out.println("Enter Account Holder Pan No Here");
		ac.setPanno(sc.next());
		System.out.println("Enter Account Hodler balance Here");
		ac.setBalance(sc.nextDouble());
		System.out.println("Enter Account Holder Gender Here");
		ac.setGender(sc.next());
	
		System.out.println("Account Created SuccessFully!!!!");
		}

	@Override
	public void viewDetails() {
	
		System.out.println("Account Details");
		System.out.println("Account Holder No:"+ac.getAcno());
		System.out.println("Account Holder Name:"+ac.getAcname());
		System.out.println("Account Holder Address:"+ac.getAddress());
		System.out.println("Account Holder Mobile No:"+ac.getMobileno());
		System.out.println("Account Holder Adhar No:"+ac.getAdharno());
		System.out.println("Account Holder Pan No:"+ac.getPanno());
		System.out.println("Account Holder Balance:"+ac.getBalance());
		System.out.println("Account Holder Gender:"+ac.getGender());
	}

	@Override
	public void depositeMoney() {
		System.out.println("Enter Amount You want deposite");
		double amt = sc.nextDouble();
		
	double newbal=	ac.getBalance()+amt;
		
		ac.setBalance(newbal);
		
		System.out.println("Amount Deposted SuccessFully"+amt);
	}

	@Override
	public void withdrawlMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewbalance() {
		System.out.println("******Account Balance******");
		System.out.println("your Account Balnce IS:"+ac.getBalance());
	}

	@Override
	public void updateDetails() {
		// TODO Auto-generated method stub
		
	}

}
