package com.greatlearning.email;

import java.util.*;
public class Emailapp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first name");
		String firstname=s.next();
		System.out.println("enter last name");
       String lastname=s.next();
//creating object for employee class
      Employee em1 =new Employee(firstname,lastname);
      int choice=-1;
do {
	System.out.println("\n*************\nenter your choice \n1.showCredentials\n2.exit ");
	choice=s.nextInt();
	switch(choice) {
	case 1:
		em1.showCredentials();
	break;
	case 2:
	System.out.println("thank you for using application");
	break;
	default:
		System.out.println("invalid choice enter proper choice");
		
	}
}while(choice!=2);
	}


	}


