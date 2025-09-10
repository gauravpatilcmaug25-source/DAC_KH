interface BonusEligible{
	double calculateBonus() ;
}
abstract class Employee{
	String name;
	int id;
	
	Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
	
	abstract double calculatesalary();	
}

class PermanentEmployee extends Employee{
	double basicSalary;
    double hra;
	PermanentEmployee(String name, int id, double basicSalary, double hra){
		super(name, id);
        this.basicSalary = basicSalary;
        this.hra = hra;
	}
	//@Override
	double calculatesalary(){
		return basicSalary + hra;
	}
	//@Override
	public double calculateBonus() {
		return calculatesalary() * 0.10;
	}
}

class ContractEmployee extends Employee{
	double BasicSalary;
    double Hra;
	ContractEmployee(String name, int id, double BasicSalary, double Hra){
		super(name,id);
		this.BasicSalary = BasicSalary;
        this.Hra = Hra;
	}
	//@Override
	double calculatesalary(){
		return BasicSalary*Hra;
	}
}

class Assign3_29{
	public static void main(String[]args){
		PermanentEmployee p1=new PermanentEmployee("Amit",121, 50000, 5000);
		PermanentEmployee p2=new PermanentEmployee("ram",122, 100000, 7000);
		ContractEmployee c1=new ContractEmployee("Raju",321, 3000, 100);
		ContractEmployee c2=new ContractEmployee("Tejas",987, 6000, 300);
		
		System.out.println(" Name "+p1.name + " Salary "+ p1.calculatesalary() + " Bonus= " + p1.calculateBonus());
		System.out.println(" Name "+p2.name + " Salary "+ p2.calculatesalary() + " Bonus= " + p2.calculateBonus());
		
		System.out.println(c1.name + " Salary = " + c1.calculatesalary());
        System.out.println(c2.name + " Salary = " + c2.calculatesalary());
		
	}
}