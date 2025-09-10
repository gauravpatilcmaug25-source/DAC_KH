class  Vehicle{
	int id;
	String ownerName;
	int vehicleType;
	static int regNo= 0;
	
	static{
		System.out.println(" ! Welcome to CDAC Vehicle Registration Portal ! ");
	}
	 
	Vehicle(String ownerName, int vehicleType){
		regNo++;
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
		this.id=regNo;
	 }
//
	public String getownr(){
		return ownerName;
	}
	public void setowner(String setowner){
		this.ownerName=ownerName;
	}
	
	public int getvehicletype(){
		return vehicleType;
	}
	public void setvehicletype(int vehicleType){
		this.vehicleType=vehicleType;
	}
	
	public int getregno(){
		return regNo;
	}
	public void setregno(int regNo){
		this.regNo=regNo;
	}
	
	public void registrationdetails(){
		System.out.println("OWNER = " +ownerName+" vehicleType = "+vehicleType+" vehicle ID = MH-2025-"+id);
	}
	 
}
class Regvehicle{
			public static void main(String[]args){
				Vehicle v1=new Vehicle("Ganpat",4);
				Vehicle v2=new Vehicle("Ganu",2);
				
				v1.registrationdetails();
				v2.registrationdetails();
}
}