class student{
	private int rollNo;
	private String name; 
	private int marks ;
	
	student(int rollNo, String name, int marks){
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	public int getmarks(){
		return marks;
	}
	public void setmarks(int marks){
		this.marks=marks;
	}
	public void display(){
		System.out.println("Name = "+name+" rollNo = "+rollNo+" marks = "+marks);
	}
}

class DetailStudent {
			public static void main(String[]args){
			student s1=new student(45,"Gaurav",78);
			s1.display();
			s1.setmarks(99);
			System.out.println("After Updating using setmarks :  \n");
			s1.display();
}
}