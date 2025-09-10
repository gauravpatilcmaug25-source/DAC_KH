import java.util.Scanner;
class Assign4_8{		
	/*static class PaymentFailedException extends Exception{
		public  PaymentFailedException(String msg){
		super(msg);
	}
	}

	public static void main(String[]args){
		try {
			boolean paymentsuccess = false;
			
			if(!paymentsuccess){
				throw new PaymentFailedException("Payment Failed");
			}
			System.out.println(" Payment Successfull.... ");
			
		}catch( PaymentFailedException e){
			System.out.println(" Exception occurred : "+e );
		}
		
		finally{
			System.out.println(" CleanUp Done ! ");
		}
	}*/
	
	
		public static void paymentprocess(){
			try{
				
				throw new Exception("Payment failed");
			}catch(Exception e){
				System.out.println(" Exception occurred: "+ e);
			}
			finally{
				System.out.println(" Cleanup Done !");
				
			}
		}
		public static void main(String[]args){
			paymentprocess();
	}
}