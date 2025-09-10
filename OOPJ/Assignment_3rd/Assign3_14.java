abstract class Employee{
	abstract void calculateBonus();
}

class manager extends Employee{
	double bonus; String name; int salary;
	manager(String name, int salary){
		this.name=name;
		this.salary=salary;
		this.bonus=bonus;
	}
	
	public void calculateBonus(){
		System.out.println("Mr. "+name+"Your Salary is : " +salary+" Your Bonus is : " + salary*0.20);
	}
	
}

class developer extends Employee{
	double bonus; String name; int salary;
	developer(String name, int salary){
		this.name=name;
		this.salary=salary;
		this.bonus=bonus;
	}
	
	public void calculateBonus(){
		System.out.println("Mr. "+name+"Your Salary is : " +salary+" Your Bonus is : " + salary*0.10);
	}
	
}

class Assign3_14{
	public static void main(String[]args){
		Employee m1=new manager("Gaurav",50000);
		Employee d1=new developer("Ganpat",100000);
		
		m1.calculateBonus();
		d1.calculateBonus();
	}
}