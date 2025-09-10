class Employee{
	protected String name ;
	protected double basicSalary;
	
	Employee(String name, double basicSalary){
		this.name=name;
		this.basicSalary=basicSalary;
	}
	public double getsalary(){
		return basicSalary;
	}
}

// subclasses
class RegularEmployee extends Employee{
	RegularEmployee(String name,double basicSalary){
		super(name, basicSalary);
	}
	
		@Override
		public double getsalary(){
		return basicSalary+(0.10*basicSalary);
		}
}

class ContractEmployee extends Employee{
	ContractEmployee(String name, double basicSalary){
		super(name, basicSalary);
	}	
		@Override
		public double getsalary(){
		return basicSalary+(0.05*basicSalary);
		}

}


class Assign3_7{
	public static void main(String[]args){
		Employee r1=new RegularEmployee("Rahul",50000);
		Employee c1=new ContractEmployee("Rohini",25000);
		
		System.out.println(" Name = "+ r1.name + " " + r1.getsalary());
		System.out.println(" Name = "+ c1.name + " " +c1.getsalary());
	}
}