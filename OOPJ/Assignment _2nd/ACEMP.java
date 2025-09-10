class Employee{
	int id; 
	String name; 
	double basicSalary;
	double netSalary;
	public static int counter=1000;
	
	Employee(){
		counter++;
		this.id=counter;
		this.name="UNKNOWN";
		this.basicSalary=10000;
	}
	Employee(String name, double basicSalary){
		counter++;
		this.id=counter;
		this.name=name;
		this.basicSalary=basicSalary;
	}
	
	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name=name;
	}
	
	public double getsalary(){
		return basicSalary;
	}
	public void setsalary(double basicSalary){
		this.basicSalary=basicSalary;
	}
	
	// Calculate Net Salary
	public double calculateNetSalary() {
    double hra = 0.10 * basicSalary;  // 10%
    double da  = 0.05 * basicSalary;  // 5%
    double ded = 0.02 * basicSalary;  // 2%

    netSalary = (basicSalary + hra + da) - ded;
    return netSalary; 
}

	
	public void display(){
		calculateNetSalary();
		System.out.println(" ID "+id+" Name = "+name+" BasicSalary = "+ basicSalary+" Netsalary = "+netSalary);
	}
}
class ACEMP{
		public static void main(String[]args){
		Employee e1=new Employee();
		Employee e2=new Employee("Gaurav",50000);	
		
		e1.display();
		e2.display();
		}
}