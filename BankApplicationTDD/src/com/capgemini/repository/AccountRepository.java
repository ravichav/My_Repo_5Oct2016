package com.capgemini.repository;

<<<<<<< HEAD
import java.util.Map;

=======
>>>>>>> 568e3d31fc1efc299f1674e114365610ce92a0e3
import com.capgemini.model.Account;

public interface AccountRepository {
	
<<<<<<< HEAD
	Map<String, Account> save(Account account);
=======
	boolean save(Account account);
>>>>>>> 568e3d31fc1efc299f1674e114365610ce92a0e3
	
	Account searchAccount(int acccountNumber);

}
