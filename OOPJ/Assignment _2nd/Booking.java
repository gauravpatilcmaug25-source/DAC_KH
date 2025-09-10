class Passenger{
	 String name; 
	 int age;
	 String seatType;
	 static int  totalpassengersbooked=0;
	
	public Passenger(String name, int age){
		this.name=name;
		this.age=age;
		this.seatType="General";
		totalpassengersbooked++;
	}
	
	public Passenger(String name, int age, String seatType){
		this.name=name;
		this.age=age;
		this.seatType=seatType;
		totalpassengersbooked++;
	}
	
	public static void displayttl(){
		System.out.println(totalpassengersbooked);
	}
	
	public void displayinfopass(){
		System.out.println("Name = "+ name + " Age = " + age + "Seat Type = " + seatType);
	}
	
}
class Booking{
	public static  void main(String[]args){
		Passenger p1=new Passenger("Ravi", 25);
		Passenger p2=new Passenger("Anita", 30, "AC Sleeper" );
		Passenger p3=new Passenger( "Suresh", 40 );
		
		p1.displayinfopass();
		p2.displayinfopass();
		p3.displayinfopass();
		
		Passenger.displayttl();
	}
}