package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.List;

public class SmartBankAccount extends BankAccount {
	
public SmartBankAccount(int customerId, String name, double balance, List<String> accounts) {
		super(customerId, name, balance, accounts);
		// TODO Auto-generated constructor stub
	}

//	SmartBankAccount(){
//		
//	}

	@Override
	public double calculateFixedAccount(double amount, int months) {
		// TODO Auto-generated method stub
		double calc=0.0;
		double r=0.10,n=12;
		if(amount>9999&&amount<1000001&&months<121&&months>0)
		{
			calc=amount*Math.pow((1+r/n),months);
			DecimalFormat df=new DecimalFormat("###.00");
			return Double.valueOf(df.format(calc));
		}
		else
			return -1;
	}

	@Override
	public double calculateRecurringAccount(double amount, int months) {
		// TODO Auto-generated method stub
		double calc=0.0;
		double r=7;
		if(amount>999&&amount<50001&&months>0&&months<61)
		{
			calc=(amount*months)+(amount*(months*(months+1))*r/100)/(2*12);
			DecimalFormat df=new DecimalFormat("###.00");
			return Double.valueOf(df.format(calc));
		}
		else 
			return -1;
	}
	
   // type  your code here
   
   
	

	
}
