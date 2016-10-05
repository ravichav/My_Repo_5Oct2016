package com.capgemini.main;

import java.util.Map;

import com.capgemini.exceptions.InsufficientInitialBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.model.Account;
import com.capgemini.repository.AccountRepository;
import com.capgemini.repository.AccountRepositoryImpl;
import com.capgemini.service.AccountService;
import com.capgemini.service.AccountServiceImpl;

public class MainBankApplication {

	
	public static void main(String[] args) throws InvalidAccountNumberException {
		AccountRepository accountRepository = new AccountRepositoryImpl();
		int accNumber=101;
		int amount=600;
		AccountService service = new AccountServiceImpl(accountRepository);
		try {
			Map<String,Account> accMap = service.createAccount(accNumber,amount );
			printAccountMapValues(accMap);
			System.out.println("Balance: "+service.showBalance(accNumber, accMap));
			//Withdraw Amount
			service.withdrawAmount(102, amount, accMap);
			//updatedBal
			
		} catch (InsufficientInitialBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void printAccountMapValues (Map<String,Account> map){
		System.out.println("printing Accounts..");
		for (Map.Entry<String, Account> entry : map.entrySet()) {
		    String key = entry.getKey();
		    Account value = entry.getValue();
		   System.out.println("key:"+key+" balance:"+value.getAmount());
		}
	}
	
}
