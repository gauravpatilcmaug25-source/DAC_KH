class Vehicle{
	public void displaySpeed(){
		System.out.println(" Vehicle speed unknown ");
	}
}

class Car extends Vehicle{
	@Override
	public void displaySpeed(){
		System.out.println(" Car speed 120 km/h ");
	}
}

class Bike extends Vehicle{
	@Override
	public void displaySpeed(){
		System.out.println(" Bike speed 80 km/h ");
	}
}

class Assign3_17{
	public static void main(String[]args){
		
		Vehicle car=new Car();
		Vehicle bike=new Car();
		
		car.displaySpeed();
		bike.displaySpeed();
	}
}