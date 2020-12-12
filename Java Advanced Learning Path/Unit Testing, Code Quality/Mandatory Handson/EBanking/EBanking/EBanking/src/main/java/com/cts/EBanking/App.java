package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE

		new SkeletonValidator();

		// CODE SKELETON - VALIDATION ENDS

		// Please start your code from here
		//Configuration and Input data read here
		//Refer sample input details
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		SmartBankAccount sbA=(SmartBankAccount) context.getBean("smartBankAccount");
		DecimalFormat df=new DecimalFormat("###.00");
		Scanner scanner = new Scanner(System.in);		
		System.out.println("Welcome Mr/Ms: "+sbA.getName()); 
		System.out.println("Your customer id is :"+sbA.getCustomerId()); 
		System.out.println("Please select account type"); 
		System.out.println("1 CurrentAccount");
		System.out.println("2 RecurringAccount");
		System.out.println("3 FixedAccount");
		double amount=0.0;
		int months=0;
		switch (scanner.nextInt()) {

		case 1:
			System.out.println("Select transaction type \n 1.Deposit \n 2.Withdraw");
			int choice = scanner.nextInt();
			if (choice == 1) {
				//Do call deposite
				System.out.println("Enter amount to be deposited");
				double amt=sbA.doDeposit(scanner.nextDouble());
				System.out.println("Your balance amount is "+df.format(amt));
			} else if (choice == 2) {
				//Do call Withdraw				
				System.out.println("Enter amount to be withdrawn");
				double amt=sbA.doWithdraw(scanner.nextDouble());
				System.out.println("Your balance amount is "+df.format(amt));
			} else {
				System.out.println("Wrong choice");
			}
			break;
		case 2:
			//Code for recurringAccount
			System.out.println("Enter monthly installment");
			amount=scanner.nextDouble();
			System.out.println("Enter tenure in months");
			months=scanner.nextInt();
			double amt=sbA.calculateRecurringAccount(amount, months);
			if(amt>0)
				System.out.println("Your balance after 10 months will be "+df.format(amt));
			break;
		case 3:
			//Code for FD 
			System.out.println("Enter FD amount");
			amount=scanner.nextDouble();
			System.out.println("Enter tenure in months");
			months=scanner.nextInt();
			double amtC=sbA.calculateFixedAccount(amount, months);
			if(amtC>0)
				System.out.println("Your balance after "+months+" months will be "+amtC);
			break;

		default:
			System.out.println("Wrong Choice");

		}

	}
}
