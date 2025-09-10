 class BankAccount{
	private  String accountholdername;
	private double balance;
	private static double interestRate;
	
	static {
		interestRate = 4.0;
        System.out.println("Bank Interest Rate Initialized: " + interestRate + "%");
	}
	BankAccount(String accountholdername, double balance ){
		this.accountholdername=accountholdername;
		this.balance=balance;
	}
//getset for name	
	public String getname(){
		return accountholdername;
	}
	public void setname(String accountholdername){
		this.accountholdername=accountholdername;
	}
//getset for balance		
	public double getbalance(){
		return balance;
	}
	public void setbalance(double balance){
		this.balance=balance;
	}

///getset for interestRate
	public double getinterest(){
		return interestRate;
	}
	public void setinterst(){
		this.interestRate=interestRate;
	}
//
		public  void showbankdetails(){
			System.out.println("Name = " + accountholdername + " Balance = " + balance + " Interest Rate " + interestRate);
		}
}
 
 
 class Accounthandle{
	public static void main(String[]args){
		BankAccount a1=new BankAccount("Gaurav",50000);
		BankAccount a2=new BankAccount("Ramesh",70000);
		
		a1.showbankdetails();
		a2.showbankdetails();
	}
 }