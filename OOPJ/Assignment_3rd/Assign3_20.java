class  Employee {
	String name;
	int salary;
	Employee(String name, int salary){
		this.name=name;
		this.salary=salary;
	}
	public void displaySalary(){}
 }
 //
class TeachingStaff extends Employee {
	String subject;
	TeachingStaff(String name, int salary){
		super(name,salary);
		this.subject=subject;
	}
	@Override 
	public void displaySalary() {
		System.out.println("  Name= "+ name + " Salary= " + salary + " Subject= " + subject);
	}
}

class Professor extends Employee{
	String specialization;
	Professor(String name, int salary, String specialization){
		super(name,salary);
		this.specialization=specialization;
	}
	@Override
	public void displaySalary() {
		System.out.println("  Name= "+ name + "Salary= " + salary + "Specialization= "+ specialization);
	}
}
class Lecturer extends Employee{
	String department; 
	Lecturer(String name, int salary, String department){
		super(name,salary);
		this.department=department;
	}
	@Override
	public void displaySalary() {
		System.out.println("  Name= "+ name + "Salary= " + salary + "Department= "+ department);
	}
}

class Assign3_20{
	public static void main(String[]args){
		//Employee t1=new TeachingStaff();
		Employee p1=new Professor("Dr. Sharma", 80000,"Algebra" );
		Employee l1=new Lecturer("Ms. Mehta", 50000, "Science");
		
		p1.displaySalary();
		l1.displaySalary();
	}
}