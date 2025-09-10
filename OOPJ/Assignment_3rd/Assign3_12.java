abstract class Payment{
	
	abstract void pay();
}

class CreditCardPayment extends Payment{
	long cardNumber; double amount;
	CreditCardPayment(long cardNumber, double amount){
		this.cardNumber=cardNumber;
		this.amount=amount;
	}
	@Override
	public void pay(){
		System.out.println("Payment via Credit Card : " + cardNumber+ " → Rs." + amount + "Paid ");
	}
}

class UPIPayment extends Payment{
	String upiId; double amount; 
	UPIPayment(String upiId, double amount){
		this.upiId=upiId;
		this.amount=amount;
	}
	@Override
	public void pay(){
		System.out.println("Payment via UPI : " + upiId + " → Rs." + amount + "Paid ");
	}
}

class Assign3_12{
	public static void main(String[]args){
			Payment c1=new CreditCardPayment(1234567456, 5000);
			Payment u1=new UPIPayment("rahul@upi",2000);
			
			c1.pay();
			u1.pay();
			
	}
}