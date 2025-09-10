class Account{
	protected int accountNo; 
	protected double balance;
	
	Account(int accountNo, double balance){
		this.accountNo=accountNo;
		this.balance=balance;
	}
	
	public void display(){
		System.out.println(" ACCOUNT NO : " + accountNo + " BALANCE : "+ balance);
	}
	
}

class SavingAccount extends Account{
	double interestRate;
	SavingAccount(int accountNo, double balance, double interestRate){
		super(accountNo,balance);
		this.interestRate=interestRate;
	}
	@Override
	public void display(){
			super.display();
	System.out.println("InterestRate : "+interestRate);
	}
}

class CurrentAccount extends Account{
	double overdraftLimit;
	CurrentAccount(int accountNo, double balance, double overdraftLimit){
		super(accountNo,balance);
		this.overdraftLimit=overdraftLimit;
	}
	@Override
	public void display(){
		super.display();
	System.out.println("OverdraftLimit : "+overdraftLimit);
	}
}

class  Assign3_11{
	public static void main(String[]args){
		Account sv=new SavingAccount(2417256, 50000, 10);
		Account ca=new CurrentAccount(984656, 100000, 5000);
		
		sv.display();
		ca.display();
	}
}