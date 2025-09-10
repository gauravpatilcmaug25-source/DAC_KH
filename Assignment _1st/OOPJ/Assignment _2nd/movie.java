class Customer{
	String name;
	String ticketType;
	static int ticketssold=0;
	
	Customer(String name) {
		this.name=name;
		this.ticketType="NORMAL";
		ticketssold++;
	}
	Customer(String name, String ticketType) {
		this.name=name;
		this.ticketType=ticketType;
		ticketssold++;
	}
	
	public void tickitdetails(){
		System.out.println("Name = " + name + " Tickit Type = " + ticketType );
	}
	
	public static void totaltickitbook(){
		System.out.println(ticketssold);
	}
}
	
class movie{
		public static void main(String[]args){
		Customer c1 = new Customer("Gaurav");
		Customer c2 = new Customer("Ganpat","Premium");
		Customer c3 = new Customer("Ganesh");
		
		c1.tickitdetails();
		c2.tickitdetails();
		c3.tickitdetails();
		
		Customer.totaltickitbook();
}
}