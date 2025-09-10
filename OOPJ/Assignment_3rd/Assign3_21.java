class Hospital{
	String  name; 
	int staffId;
	
	Hospital(String name, int staffId){
		this.name=name;
		this.staffId=staffId;
	}
	
	public void displayDetails(){
	System.out.println("  ");
	} 
}

class Doctor extends Hospital{
	String specialization;
	Doctor(String name, int staffId, String specialization){
		super(name,staffId);
		this.specialization=specialization;
	}
	@Override
	public void displayDetails(){
	System.out.println(" Name = "+ name +"ID= "+staffId+" Specialization = "+specialization);
	} 	
}

class Nurse extends Hospital{
	String shift;
	Nurse(String name, int staffId, String shift){
		super(name,staffId);
		this.shift=shift;
	}
	@Override
	public void displayDetails(){
	System.out.println(" Name = "+ name +"ID= "+staffId+" Shift = "+shift );
	} 
	
}

class Assign3_21{
	public static void main(String[]args){
		Hospital d1=new Doctor("Dr. Reddy" ,101,"Cardiology");
		Hospital n1=new Nurse("Nisha" ,102,"Night" );
		
		d1.displayDetails();
		n1.displayDetails();
	}
}