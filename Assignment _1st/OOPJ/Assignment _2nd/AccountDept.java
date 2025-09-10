class Studentdetail{
	private String name;
	private String classname;
	private static int tuitionfee;
 
//static call
	static {
		tuitionfee = 30000;
		System.out.println(" The tuition fee for program Increase by  " + tuitionfee );
	}
//constructure call
	Studentdetail(String name, String classname){
		this.name=name;
		this.classname=classname;
	}
//getset call	
	public int gettuitionfee(){
		return tuitionfee;
	}
	public void settuitionfee(int tuitionfee){
		this.tuitionfee=tuitionfee;
	}

	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name=name;
	}
	
	public String getclassname(){
		return classname;
	}
	public void setclassname(String classname){
		this.classname=classname;
	}

//display
	public void display(){
		System.out.println(" Name "+ name +" \n Classname "+ classname +"\n Fees Increase by "+ tuitionfee);
	}
}
class AccountDept{
		public static void main(String[]args){
		Studentdetail s1= new Studentdetail("Ganpat","11th");
		Studentdetail s2= new Studentdetail("Sham","10th");
		Studentdetail s3= new Studentdetail("Ram","12th");
		
		s1.display();
		s2.display();
		s3.display();
		
}
}