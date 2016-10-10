import java.util.LinkedList;
import java.util.List;

public class ICICIBank {
	
	List<Account> accounts = new LinkedList<Account>();
	
	String createAccount(int accountNumber,int amount)
	{
		Account account = new Account(accountNumber,amount);
		
		accounts.add(account);
		
		return "account created successfully";
	}
	
	private Account searchAccount(int accountNumber) throws InvalidAccountNumberException
	{
		for(Account account : accounts)
		{
			if(account.getAccountNumber()==accountNumber)
			{
				return account;
			}
		}
		
		throw new InvalidAccountNumberException();
	}
	
	
	public int withdrawAmount(int accountNumber,int amount) throws InvalidAccountNumberException, InsufficientBalanceException
	{
		Account account = searchAccount(accountNumber);
		
		if((account.getAmount()-amount)>=0)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			account.setAmount(account.getAmount()-amount);
			return account.getAmount();
		}
		
		throw new InsufficientBalanceException();
	}

}
