package com.greatlearning.email;

import java.util.*;

public class Employee {
	public Scanner s=new Scanner(System.in);
	//setting variables as private
	private String firstname;
	private String lastname;
	private String department;
	private String password;
	private String email;
	//constructor creation
	public Employee(String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
		System.out.println("New Employee:"+this.firstname+""+this.lastname);
	//calling methods
		this.department=this.setDept();//department
		this.password=this.generate_password( 8);//password
		this.email=this.generate_email();	//email
	}
	
//generate mail method
	private String generate_email() {
		return this.firstname.toLowerCase()+"."+this.lastname.toLowerCase()+"@"+this.department.toLowerCase()+".company.com";
	}
	//asking for department
	private String setDept() {
		System.out.println("please enter the department from the following");
		System.out.println("Department codes\n 1.Technical\n 2.Admin\n 3.Human Resource\n 4.Legal");
	boolean flag = false;
	do {
		System.out.println("enter Department codes");
		int choice=s.nextInt();
		switch(choice) {
		case 1:
			return "technical";
		case 2:
			return "Admin";
		case 3:
			return "Human Resource";
		case 4:
			return "legal";
			default:
				System.out.println("invalid choice please enter valid choice");
		}
	}while(!flag);
	return null;
	
	}
	//generate random password
	private String generate_password(int length) {
		Random r=new Random();
		String Capital_chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String Symbols="!@#$%&?";
		String values=Capital_chars+Small_chars+numbers+Symbols;
		String password=" ";
		for(int i=0;i<length;i++) {
			password=password+values.charAt(r.nextInt(values.length()));
		}
		return password;	
		}
	
	
	
	
	//display user information method
	public void showCredentials() {
		System.out.println("new:"+this.firstname+" "+this.lastname);
		System.out.println("department:"+this.department);
		System.out.println("email:"+this.email);
		System.out.println("password:"+this.password);
		
	}




	

	




	

	}


