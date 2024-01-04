package com.digitalbanking.userview_pannel;

import java.util.Scanner;

import com.digitalbanking.userview_pannel.bank.model.AccountHolder;
import com.digitalbanking.viewModel.BankOperation;

public class Account {
	
	private BankOperation bankOperation;
	
	public Account() {
		
		bankOperation = new BankOperation(this);
	}


	public static void main(String[] args) {
		Account account=new Account();
		account.start();
	}

	private void start() {
		boolean running=true;
		while(running) {
		System.out.println("1.Login\n 2.signup \n 3.Account Creation \n 4.view Profile \n 5.Exit");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		switch(choice) {
		case 1:
			login();
			break;
		case 2:
			signUp();
			break;
		case 3:
			accountCreation();
			break;
		case 4:
			Profile();
			break;
		case 5:
			System.out.println("Thank you!");
			running=false;
		
		default:System.err.println("Invalid Try Again");
		
		}
		}
		
	}
	
	private void signUp() {
		Scanner in=new Scanner(System.in);
		System.out.println("New User to create Account: ");
	System.out.println("Enter the name");
	String name=in.next();
	System.out.println("Enter Email:");
	String email=in.next();
	
	if(bankOperation.isEmailIsValid(email)) {
		 System.out.println("Email already exists. Please use a different email.");
         return;
	}
	System.out.println("Enter Password:");
	String password=in.next();
	System.out.println("Re Enter Password:");
	String repassword=in.next();
	AccountHolder signup=new AccountHolder(repassword, password, email, name);
	 bankOperation.signup(signup);
	
	}


	private void login() {
		Scanner in=new Scanner(System.in);
		System.out.println("You Already Have An Account: ");
		System.out.println("Enter Email:");
		String email=in.next();
		System.out.println("Enter Password:");
		String password=in.next();
		AccountHolder login=new AccountHolder(email,password);
		if(bankOperation.isValidLogin(login)) {
			System.out.println("Login Succesfully");
			bankOperation.login(login);
		}
			
				
		else {
			System.err.println("Invalid email or password. Please try again.");
		}
		 
	}



	private void accountCreation() {
	Scanner in=new Scanner(System.in);
	String name;
	int age;
	String gender;
	String email;
	String dob;
	String mobileNo;
	String country;
	String state;
	String adharNo;
	String panNo;
	
	
	
	System.out.println("Enter your Name:");
	 name=in.next();
	System.out.println("Enter Age:");
	 age=in.nextInt();
		System.out.println("Enter Gender: ");
	 gender=in.next();
		System.out.println("Enter Email:");
	 email=in.next();
		System.out.println("Enter DOB:");
	 dob=in.next();
		System.out.println("Enter MobileNo:");
	 mobileNo=in.next();
		System.out.println("Enter Country:");
	 country=in.next();
		System.out.println("Enter State:");
	 state=in.next();
		System.out.println("Enter AdharNo:");
	 adharNo=in.next();
		System.out.println("Enter PanNo:");
	 panNo=in.next();
	 
	 AccountHolder accountholder=new AccountHolder(name,age,gender,email,dob,mobileNo,country,state
			                                        ,adharNo,panNo, panNo, age);
	 bankOperation.accountCreate(accountholder);
	 boolean running=true;
		while(running) {
		System.out.println("1.Deposit \n2.withdraw \n3.GetBalence \n4.Exit");
		
		int choice=in.nextInt();
		switch(choice) {
		case 1:
			deposit();
			break;
		case 2:
			withdraw();
			
			break;
		case 3:
			getbalece();
			break;
		case 4:
			System.out.println("Thank you!");
			running=false;
			start();
		default:System.out.println("Invalid Try Again");	
		}
		}
		
	

	 
		
	}
	
	public void onSuccess() {
		System.out.println("Account Created Successfully");

	}

	public void showError(String errorMessage) {
		System.out.println(errorMessage);
	}
	public void Profile() {
	    bankOperation.viewProfile();
	}
	
	private void deposit() {
		Scanner in=new Scanner(System.in);
		   System.out.print("Enter deposit amount: $");
           double depositAmount = in.nextDouble();
           bankOperation.todeposite(depositAmount);
           
	
		
	}

	private void withdraw() {
		Scanner in=new Scanner(System.in);
		   System.out.print("Enter withdraw amount: Rs:");
           double depositAmount = in.nextDouble();
		bankOperation.toWithdraw(depositAmount);
	}


	private void getbalece() {
		
		
	}






	public void accountHolderList(AccountHolder holderList) {
		// TODO Auto-generated method stub
		
	}


}


