class Vehicle{
	protected String brand;
	protected double speed;
	
	Vehicle(String brand, int speed){
		this.brand=brand;
		this.speed=speed;
	}

	public void displayinfo(){
		System.out.println(" Vehicle ->" + brand + " speed -> " + speed);
	}
//////SUBCLASSES
//Subclass 1
class car extends Vehicle{
private String model ;
	car(String brand, int speed, String model){
		super(brand,speed);
		this.model=model;
	}
	
	@Override
	public void displayinfo(){
		System.out.println(" Vehicle ->" + brand + " speed -> " + speed + " model --> " + model);
	}
}

//Subclass 2 
class bike extends Vehicle{
private String model ;
	bike(String brand, int speed, String model ){
		super(brand,speed);
		this.model=model;
	}
	
	@Override
	public void displayinfo(){
		System.out.println("Car -> " + brand + " Speed -> "+ speed  + " Model " +model ); 
	}
}

class Assign3_8{
	public static void main(String[]args){
		Vehicle c1=new car("AUDI",180,"Q7");
		Vehicle b1=new bike("Royal Enfild",200,"Hunter");
		
		c1.displayinfo();
		b1.displayinfo();
	}
}