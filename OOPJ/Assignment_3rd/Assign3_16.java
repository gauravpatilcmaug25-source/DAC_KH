class Employee{
	protected String name;
	protected double salary;
	
	Employee(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	
	public void display(){
		System.out.println(" ");
	}
	
}

class Manager extends Employee{
	double bonus;
	Manager(String name, double salary){
		super(name,salary);
		this.bonus=bonus;
	}
	@Override
	public void display(){
		System.out.println(name + "  Salary = "+salary + "Bonus :"+salary*0.20);
	}
}

class Developer extends Employee{
	double bonus;
	Developer(String name, double salary){
		super(name,salary);
		this.bonus=bonus;
	}
	@Override
	public void display(){
		System.out.println(name + "  Salary = "+salary + " Bonus is "+salary*0.10);
	}
}

class Assign3_16{
	public static void main(String[]args){
		Employee m1=new Manager("Gaurav",100000);
		Employee d1=new Developer("Ganpat",50000);
		
		m1.display();
		d1.display();
	}
}