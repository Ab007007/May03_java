package com.synehcron.jt.exceptions;

public class BalanceInsufficientException extends Exception 
{
	public BalanceInsufficientException()
	{
		System.out.println("BALANCE INSUFFICIENT");
	}
	
	
	public BalanceInsufficientException(int balance)
	{
		System.out.println("[TRANSACTION FAILED] - " + balance);
	}
	
	@Override
	public String getMessage()
	{
		// TODO Auto-generated method stub
		return "please check your balance before performing operation";
	}
}
