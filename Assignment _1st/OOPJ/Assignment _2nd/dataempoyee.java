class Employee{
	private String name;
	private double salary;
	private int yearsOfService;
	static int totalEmployees=0;
//constructor	
	public Employee(String name, double salary, int yearsOfService){
		this.name=name;
		this.salary=salary;
		this.yearsOfService=yearsOfService;
		totalEmployees++;
	}	
//setget for name	
		public String getname(){
			return name;
		}
		public void setname(String name){
		this.name=name;
		}
//setget for salary
		public double getsalary(){
			return salary;
		}
		public void setsalary(double salary){
			this.salary=salary;
		}	
//setget for yearsOfService
		public int getyearsOfService(){
			return yearsOfService;
		}
		public void setyearsOfService(int yearsOfService){
			this.yearsOfService=yearsOfService;
		}
//to calculate bonus
		public double calculatebonus() {
			if (yearsOfService >= 5) {
				double bonus = salary * 0.05;  // 5% of salary
				return bonus;                  // ✅ return it
			} else {
				return 0.00;
			}
}

//to display total employee
	public static void display(){
		System.out.println("Total Employees = "+totalEmployees);
	}
}
class dataempoyee{
	public static void main(String[]args){
		Employee e1=new Employee("Ravi", 150000,6 );
		Employee e2=new Employee( "Anita", 120000, 3);
		Employee e3=new Employee( "Suresh", 100000, 5 );
		
		System.out.println("Employee"+ e1.getname() + " Bonus For You !! " + e1.calculatebonus());
		System.out.println("Employee"+ e2.getname() + " Bonus For You !! " + e2.calculatebonus());
		System.out.println("Employee"+ e3.getname() + " Bonus For You !! " + e3.calculatebonus());
		
		Employee.display();
		
	}
}