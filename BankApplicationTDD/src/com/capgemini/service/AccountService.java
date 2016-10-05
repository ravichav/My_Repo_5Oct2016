package com.capgemini.service;

import java.util.Map;

import com.capgemini.exceptions.InsufficientInitialBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.model.Account;

public interface AccountService {
	
	Map<String, Account> createAccount(int accountNumber,int amount)throws InsufficientInitialBalanceException;
	
	//int showBalance(int accountNumber) throws InvalidAccountNumberException;

	int showBalance(int accountNumber, Map<String, Account> accMap) throws InvalidAccountNumberException;

	int  withdrawAmount(int accountNumber,int amount,Map<String, Account> map) throws InvalidAccountNumberException;
	
}
