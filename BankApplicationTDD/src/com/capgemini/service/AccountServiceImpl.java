package com.capgemini.service;

<<<<<<< HEAD
import java.util.Map;

=======
>>>>>>> 568e3d31fc1efc299f1674e114365610ce92a0e3
import com.capgemini.exceptions.InsufficientInitialBalanceException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.model.Account;
import com.capgemini.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {

	private AccountRepository accountRepository;
<<<<<<< HEAD

	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public Map<String, Account> createAccount(int accountNumber, int amount)
			throws InsufficientInitialBalanceException {
		if (amount < 500) {
			throw new InsufficientInitialBalanceException();
		}

		
			Account account = new Account();

			account.setAccountNumber(accountNumber);
			account.setAmount(amount);

			return (accountRepository.save(account));
	}

	public boolean isAccountExist(Map<String, Account> accMap, int accountNumber)   {
		System.out.println("printing Accounts..");
		if (accMap != null) {
			for (Map.Entry<String, Account> entry : accMap.entrySet()) {
				String key = entry.getKey();
				if (key.equals(String.valueOf(accountNumber))) {
					System.out.println("success..Account Exist");
					return true;
				}
			}
		}
		return false;
		
	}

	public Account searchAccount(Map<String, Account> accMap, int accountNumber) throws InvalidAccountNumberException {
		System.out.println("Searching for Account..");
		Account accountObj=null;
		if (accMap != null) {
			for (Map.Entry<String, Account> entry : accMap.entrySet()) {
				String key = entry.getKey();
				if (key.equals(String.valueOf(accountNumber))) {
					accountObj = entry.getValue();
					return accountObj;
				}
			}
		}
		return accountObj;
	
	}
	
	@Override
	public int showBalance(int accountNumber, Map<String, Account> accMap) throws InvalidAccountNumberException {
		// TODO Auto-generated method stub
		int balance = 0;
		Account myAccountObj = null;
		if (accMap != null) {
			for (Map.Entry<String, Account> entry : accMap.entrySet()) {
				String key = entry.getKey();
				if (key.equals(String.valueOf(accountNumber))) {
					myAccountObj = entry.getValue();
				}
				// ...
			}
		}
		return myAccountObj.getAmount();
	}

	@Override
	public int withdrawAmount(int accountNumber, int amount,Map<String, Account> accMap) throws InvalidAccountNumberException {
		// check for valid account number
		System.out.println("Withdrawing Amount..");
		boolean isAccountValid = false;
		Account accountObj = null;
		int newBal=0;
		isAccountValid = isAccountExist(accMap,accountNumber);
		if(!isAccountValid){
			throw new InvalidAccountNumberException("Invalid Account Number !!");
		}else{
			accountObj = searchAccount(accMap, accountNumber);
			if(null!=accountObj){
			System.out.println("Actual Balance:"+accountObj.getAmount());
			}
			newBal = accountObj.getAmount()-200;
          System.out.println("New bal after withdraw --> "+newBal);
		}
		
		return newBal;
=======
	
	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository=accountRepository;
	}
	@Override
	public Account createAccount(int accountNumber, int amount) throws InsufficientInitialBalanceException {
		if(amount<500)
		{
			throw new InsufficientInitialBalanceException();
		}
		
		Account account = new Account();
		
		account.setAccountNumber(accountNumber);
		account.setAmount(amount);
		
		if(accountRepository.save(account))
		{
			return account;
		}
		
		return null;
	}

	@Override
	public int showBalance(int accountNumber) throws InvalidAccountNumberException {
		// TODO Auto-generated method stub
		return 0;
>>>>>>> 568e3d31fc1efc299f1674e114365610ce92a0e3
	}

}
