class student{
	private int rollNo;
	private String name; 
	private int marks ;
	
	student(int rollNo, String name, int marks){
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	
	public  String calculateGrade(){
		if(marks>90){
			return "Greade = A";
		}
		else if(marks>=80 && marks<=89){
			return "Greade = B";
		}
		else if(marks>=60 && marks<79){
			return "Greade = C";
		}
		else if(marks>50 && marks<59){
			return "Greade = D";
		}
		else if(marks>=35 && marks<=49){
			return "Greade = E";
		}
		else{
			return "Fail";
		}
	}
	
	public void display(){
		System.out.println("Name = "+name+" rollNo = "+rollNo+" marks = "+marks+ "\n Your Grader is = "+calculateGrade());
	}
}

class ResultStudent {
			public static void main(String[]args){
			student s1=new student(45,"Gaurav",78);
			student s2=new student(75,"Ganpat",25);
			student s3=new student(14,"Ganpat",60);
			
			s1.display();
			s2.display();
			s3.display();
			
}
}