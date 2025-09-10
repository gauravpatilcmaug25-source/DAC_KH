interface Callable{
  void makeCall(String number);
}  
interface Messaging {
 void sendMessage(String number, String message);
} 
interface Internet {
 void browse(String website);
} 

class SmartPhone implements Callable, Messaging, Internet{
	@Override
	public void makeCall(String number){
		System.out.println(" NUMBER =>  "+number);
	}
	@Override
	public void sendMessage(String number, String message){
		System.out.println(" NUMBER =>  "+number + " Message => "+message);
	}
	public void browse(String Website){
		System.out.println(" Website => "+Website);
	}
}

class Assign3_26{
	public static void main(String[]args){
		SmartPhone cus1=new SmartPhone();
		SmartPhone cus2=new SmartPhone();
		SmartPhone cus3=new SmartPhone();
		
		cus1.makeCall("8010837661");
		cus2.sendMessage("8754213698","Hello, Ganpat....");
		cus3.browse("WWW.CdacMumbai.com");
		
	}
}