package names;

public class BankAccount {
	String AccountName;
	int CurrentAmount;
	int InitialAmount;
	//make the constructor
	BankAccount(){}

	//make the constructor
	BankAccount(String Account, int IntAmount){
		this.AccountName = Account;
		this.InitialAmount =IntAmount;
		this.CurrentAmount = IntAmount;

}
 public int Deposit(int depositamount) {
	  CurrentAmount += depositamount;
	 return CurrentAmount;
 }
 public int Withdraw(int withdrawamount) {
	  CurrentAmount -= withdrawamount;
	 return CurrentAmount;
 }
}
class SavingAcc extends BankAccount{
	public SavingAcc(String Account, int IntAmount, int depositamount){
		super(Account, IntAmount);
		super.Deposit(depositamount);
		
	}
}
class CheckingAcc extends BankAccount{
	CheckingAcc(String Account, int IntAmount, int depositamount, int withdrawamount){
		super(Account, IntAmount);
		super.Deposit(depositamount);
		super.Withdraw(withdrawamount);
	}
}


