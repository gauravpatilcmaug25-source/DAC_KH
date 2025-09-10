class BankAccount{
	private double balance;
	
	BankAccount(){
		this.balance=0.0;
	}
	
public double getbalance(){
	return balance;
}
	
	public void deposite(int amt){
		if(amt>10){
		balance = balance + amt;
		}
		else{
			System.out.println("Not Sufficient Amount to Deposite....");
		}
	}
	public void withdraw(int amt){
		if(amt<balance){
		balance = balance - amt;
		}
		else{
			System.out.println(" Unsufficient Balance !! ");
		}
	}
	
}
class Assign3_1{
	public static void main(String[]args){
		BankAccount a1=new BankAccount();
		System.out.println("Balance = "+ a1.getbalance());
		a1.deposite(5000);
		System.out.println("Balance = "+ a1.getbalance());
		a1.withdraw(2000);
		System.out.println("Balance = "+ a1.getbalance());
		a1.withdraw(10000);
		
	}
}