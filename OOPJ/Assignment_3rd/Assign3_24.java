interface Payment{
	void pay(int amount);
}

class CreditCardPayment implements Payment{
	@Override
	public void pay(int amount){
		System.out.println(" CreditCardPayment -> " + amount);
	}
}

class PayPalPayment implements Payment{
	@Override
	public void pay(int amount){
		System.out.println(" PayPalPayment -> " + amount);
	}
}

class Assign3_24{
	public static void main(String[]args){
		CreditCardPayment p1=new CreditCardPayment();
		PayPalPayment p2=new PayPalPayment();
		
		p1.pay(42000);
		p2.pay(12000);
		
	}
}