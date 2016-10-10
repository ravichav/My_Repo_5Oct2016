package com.capgemini.service;

<<<<<<< HEAD
import java.util.Map;

=======
>>>>>>> 568e3d31fc1efc299f1674e114365610ce92a0e3
import com.capgemini.exceptions.InsufficientInitialBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.model.Account;

public interface AccountService {
	
<<<<<<< HEAD
	Map<String, Account> createAccount(int accountNumber,int amount)throws InsufficientInitialBalanceException;
	
	//int showBalance(int accountNumber) throws InvalidAccountNumberException;

	int showBalance(int accountNumber, Map<String, Account> accMap) throws InvalidAccountNumberException;

	int  withdrawAmount(int accountNumber,int amount,Map<String, Account> map) throws InvalidAccountNumberException;
	
=======
	Account createAccount(int accountNumber,int amount)throws InsufficientInitialBalanceException;
	
	int showBalance(int accountNumber) throws InvalidAccountNumberException;

>>>>>>> 568e3d31fc1efc299f1674e114365610ce92a0e3
}
