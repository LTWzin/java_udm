package model.entites;

import model.exceptions.WithdrawLimitException;

public class Account {
	
	protected Integer number;
	protected String holder;
	protected Double balance;
	protected Double withdrawLimit;
	
	public Account() {	
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	
	public void deposit(double quantity){
		
		this.balance += quantity;
	}
	
	public void withdraw(double quantity) throws WithdrawLimitException {
		if (quantity > withdrawLimit) {
			throw new WithdrawLimitException("The amount exceeds withdraw limit.");
		}
		if (quantity > balance) {
			throw new WithdrawLimitException("Not enough balance.");
		}
		this.balance -= quantity;
	}
	
}
