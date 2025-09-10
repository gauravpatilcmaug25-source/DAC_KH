class passen{
	String passengerName;
	int ticketNo;
	static int counter=5000;
	
	passen(String passengerName){
		counter++;
		this.passengerName=passengerName;
		this.ticketNo=counter;
	}
	
	public void displayinfopass(){
				System.out.println(" Passenger Name = " +passengerName+" Tickit Number = "+ticketNo);
	}	
}
class tickitbook{
	public static void main(String[]args){
		passen p1=new passen("Gaurav");
		passen p2=new passen("Ramesh");
		
		p1.displayinfopass();
		p2.displayinfopass();
		
}
}	