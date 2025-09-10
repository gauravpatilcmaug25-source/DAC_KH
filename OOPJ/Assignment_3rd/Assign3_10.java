class Staff{
	protected String name;
	protected double salary;
	Staff(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	
	public void display(){
		System.out.println(" Name : " + name +" Salary : " + salary );
	}
}

class TeachingStaff extends Staff{
	String department;
	TeachingStaff(String name, double salary, String department){
		super(name,salary);
		this.department=department;
	}
	public void display(){
		System.out.println(" Name : " + name +" Salary : " + salary + " Department : "+department );
	}
}

class NonTeachingStaff extends Staff{
	String department;
	NonTeachingStaff(String name, double salary, String department){
		super(name,salary);
		this.department=department;
	}
	public void display(){
		System.out.println(" Name : " + name +" Salary : " + salary + " Department : "+department);
	}
}
	
class Assign3_10{
	public static void main(String[]args){
		Staff s1=new TeachingStaff("Gaurav",500000,"Reasearch and development");
		Staff s2=new NonTeachingStaff("Ganpat",600000,"Production");
		
		s1.display();
		s2.display();
		
	}
}