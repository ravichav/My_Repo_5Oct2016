
public class BankRunner implements Runnable {
	
	ICICIBank bank;
	
	BankRunner(ICICIBank bank)
	{
		this.bank=bank;
	}

	@Override
	public void run() {
		try
		{
			synchronized(bank){
			doWithdraw();
			}
		
		}catch(InvalidAccountNumberException ian)
		{
			System.out.println("Invalid account number");
		}catch(InsufficientBalanceException ibe)
		{
			System.out.println("Insufficient balance ");
		}

	}
	
	public void doWithdraw() throws InvalidAccountNumberException, InsufficientBalanceException{
		if(Thread.currentThread().getName().equals("first"))
		{
			System.out.println("Balance = "+bank.withdrawAmount(101, 2000));
		}
		else
		{
			System.out.println("Balance = "+bank.withdrawAmount(101, 2000));
		}
	}

}
