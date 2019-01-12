package names;

public class Answer11{

	public static void main(String[] args) {
		CheckingAcc a = new CheckingAcc("Checking", 20000, 6000, 3000);
		SavingAcc b = new SavingAcc("Saving", 10000, 5000);
		System.out.println(a.AccountName);
		System.out.println(b.CurrentAmount);
		System.out.println(a.CurrentAmount);
		a.Deposit(12000);
		//a.Withdraw(2000);
		System.out.println(a.CurrentAmount);
		System.out.println(a.InitialAmount);
		a.Withdraw(36000);
		System.out.println(a.CurrentAmount);
		
		
	}

}
