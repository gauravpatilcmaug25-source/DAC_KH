class BankAccount{
	private String  accountHolder;
	private int balance;
	
	BankAccount(String accountHolder,int balance){
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	public int getbalance(){
		return balance;
	}
	public void setbalance(int balance){
		this.balance=balance;
	}
	
	public void deposite(double amt){
		if(amt>0){
			balance+=amt;
			System.out.println(accountHolder + " deposited: " + amt);
		}
		else{
			System.out.println("Amt should be Greater than 100 for deposite");
		}
	}
	
	public void withdraw(double amt){
		if(amt>0&& amt<=balance){
			balance-=amt;
			System.out.println(accountHolder + " Withdraw : " + amt);
		}
		else{
			System.out.println("Amt should be Lesser than Available Balance for Withdrow");
		}
	}
	
	public void display(){
				System.out.println(" Name "+ accountHolder +" balance "+ balance);
	}
	
}
class bank{
		public static void main(String[]args){
		BankAccount ba1=new BankAccount("Gaurav",45000);
		
		ba1.display();
		
		ba1.withdraw(10000);
		
		ba1.display();
		
		ba1.deposite(20000);
		
		ba1.display();
		
	}
}