package com.capgemini.repository;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.model.Account;

public class AccountRepositoryImpl implements AccountRepository {

	@Override
	public Map<String, Account> save(Account account) {
		// TODO Auto-generated method stub
		Map<String,Account> accountMap = new HashMap<String,Account>();
		accountMap.put(String.valueOf(account.getAccountNumber()), account);
		System.out.println("Map Entries:"+accountMap.size());
		return accountMap;
	}

	@Override
	public Account searchAccount(int acccountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
