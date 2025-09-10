class Member{
	String name;
	int id; 
	
	Member(String name, int id) {
        this.name = name;
        this.id = id;
    }
	
	void displayInfo(){
		System.out.println(" Name is - " + name + " ID is - "+ id);
	} 
}

class teacher extends Member{
	String subject;
	teacher(String name, int id, String subject){
		super(name,id);
		this.subject=subject;
	}
		public void displayInfo(){
			System.out.println(" Name is - " + name + " ID is - "+ id+" Subject = "+subject);
		}
}

class Student extends Member{
	String grade;
	Student(String name, int id, String grade){
		super(name,id);
		this.grade=grade;
	}
		public void displayInfo(){
			System.out.println(" Name is - " + name + " ID is - "+ id+" Grade = "+grade);
		}
}

class staff extends Member{
	String department;
	staff(String name, int id, String department){
		super(name,id);
		this.department=department;
	}
		public void displayInfo(){
			System.out.println(" Name is - " + name + " ID is - "+ id+" Department = "+department);
		}
}


class Assign3_23{
	public static void main(String[]args){
		teacher t1=new teacher("Mr. Kumar",101,"English" );
		Student s1=new Student("Riya",201, "Grade=10");
		staff st1= new staff("Mr. Das", 301,"Maintenance");
		
		t1.displayInfo();
		s1.displayInfo();
		st1.displayInfo();
}
}