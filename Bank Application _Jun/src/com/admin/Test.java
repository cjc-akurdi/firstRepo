package com.admin;

import java.util.Scanner;

import com.service.RBI;
import com.serviceImpl.SBI;

public class Test {

	public static void main(String[] args) {
         System.out.println("Main---Start");
		
		RBI rbi=new SBI();
		
		 Scanner sc=new Scanner(System.in);
		
		boolean flag=true;
		
		 while (flag) 
		 {
				System.out.println("Enter 1 For CreateAccount");
				System.out.println("Enter 2 For ViewDetails");
				System.out.println("Enter 3 For Deposite Money");
				System.out.println("Enter 4 For Withdrawl Money");
				System.out.println("Enter 5 For View Balance");
				System.out.println("Enter 6 For Update Details");
				System.out.println("Enter 7 For  Exit");
			     int ch = sc.nextInt();	
			   
			     
			     switch(ch)
			     {
			      case 1:
			    	  rbi.createAccount();
			    	  break;
			    	  
			      case 2:
			    	  rbi.viewDetails();
			    	  break;
			    	  
			      case 3:
			    	  rbi.depositeMoney();
			    	  break;
			    	  
			      case 4:
			    	  rbi.withdrawlMoney();
			    	  break;
			      case 5:
			    	  rbi.viewbalance();
			    	  break;
			      case 6:
			    	  rbi.updateDetails();
			    	  break;
			    	  
			      case 7:
			    	  flag=false;
			    	  System.out.println("Thank For banking With Us!!!!!!");
			    	  break;
			    	  
			    	  default:
			    		  System.out.println("Your Choice is wrong");
			    		  break;
			     }
			     
		
		 }		 
	}
	
}
