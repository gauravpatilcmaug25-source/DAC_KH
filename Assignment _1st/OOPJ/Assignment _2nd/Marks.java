class Student{
	private String name;
	private int marks;
	static int totalStudents=0;
	
//Constructor 
		Student(String name, int marks){
			this.name=name;
			this.marks=marks;
			totalStudents++;
			}
//getset name
	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name=name;
	}
//getset marks
	public int getmarks(){
		return marks;
	}
	public void setmarks(int marks){
		this.marks=marks;
	}
	
	public String passed(){
		if(marks>35){
			return "  Your Passed";
		}
		else{
				return " Your Failed";
		}
	
	}
	
	public static void showTotalStudents(){
		System.out.println(totalStudents);
	}
}

class Marks{
	public static void main(String[]args){
		Student s1=new Student("Ramesh",85);
		Student s2=new Student("Suresh",45);
		Student s3=new Student("Ganesh",25);
		
		System.out.println("NAME : " + s1.getname() + s1.passed());
		System.out.println("NAME : " + s2.getname() + s2.passed());
		System.out.println("NAME : " + s3.getname() + s3.passed());
		
		Student.showTotalStudents();
	}
}