class BankAccount{
	long accountNumber;
	String accountHolder; 
	long balance;
	
	BankAccount(long accountNumber, String accountHolder, long balance){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public void displayBalance(){
		System.out.println(" Checking Balance..... ");
	}
}

class Saving extends BankAccount{
	int interestRate;
	Saving(long accountNumber, String accountHolder, long balance){
		super(accountNumber, accountHolder, balance);
		this.interestRate=interestRate;
	}
	public void displayBalance(){
		System.out.println("Name :  " + accountHolder + " → Balance "+ balance +" Interest= 5%" );
	}
}

class Current extends BankAccount{
	int overdraft;
	Current(long accountNumber, String accountHolder, long balance){
		super(accountNumber, accountHolder, balance);
		this.overdraft=overdraft;
	}
	public void displayBalance(){
		System.out.println("Name :  " + accountHolder + " → Balance "+ balance +" overdraft=  10000" );
	}
}

class Assign3_19{
	public static void main(String[]args){
		BankAccount b;
		
		b=new Saving(45127885,"Ganpat",45000);
		b.displayBalance();
		
		b=new Current(9963582," Raghav ",70000);
		b.displayBalance();
	}
}