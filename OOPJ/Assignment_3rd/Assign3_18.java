class Payment{
	public void pay(){
		System.out.println(" Pyament ongoing.... ");
	}
}

class CreditCardPayment extends Payment{
	String cardNumber;
    double amount;
	CreditCardPayment(String cardNumber, double amount){
		this.amount=amount;
		this.cardNumber=cardNumber;
	}
	public void pay(){
		System.out.println(" Payment via Credit Card " + cardNumber + " → Rs. " + amount + " Paid ");
	}
}

class UPIPayment extends Payment{
	String UPInumber;
    double amount;
	UPIPayment(String UPInumber, double amount){
		this.UPInumber=UPInumber;
		this.amount=amount;
	}
	public void pay(){
		System.out.println(" Payment via UPI " + UPInumber + " → Rs. " + amount + " Paid ");
	}
}

class Assign3_18{
	public static void main(String[]args){
		Payment p;
		p=new CreditCardPayment("457842141",45000);
		p.pay();
		
		p=new UPIPayment("ganpat@upi",12000);
		p.pay();
	}
}