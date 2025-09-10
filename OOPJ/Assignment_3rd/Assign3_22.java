interface LandVehicle {
	void driveOnLand();
}

interface WaterVehicle{
	void driveOnWater();
}

class AmphibiousVehicle implements LandVehicle, WaterVehicle{
	String name;
	AmphibiousVehicle(String name){
		this.name=name;
	}
	
	@Override
	public void driveOnLand(){
		System.out.println(name + " Driving on Land ");
	}
	@Override
	public void driveOnWater(){
		System.out.println(name + " Driving on Water ");
	}
}

class Assign3_22{
	public static void main(String[]args){
		AmphibiousVehicle v1=new AmphibiousVehicle("Hydrocar");
		
		v1.driveOnLand();
		v1.driveOnWater();
	}
}

