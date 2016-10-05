package com.capgemini.repository;

import java.util.Map;

import com.capgemini.model.Account;

public interface AccountRepository {
	
	Map<String, Account> save(Account account);
	
	Account searchAccount(int acccountNumber);

}
