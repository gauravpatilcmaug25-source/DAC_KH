import java.util.Scanner;
class Student{
	private int marks;
	
	Student(){
		int marks=0;
	}
	
public int getmarks(){
	return marks;
}
public void setmarks(int marks){
	if(marks<100 && marks>0){
	this.marks=marks;
	}
	else{
		System.out.println(" Not valid marks: ");
	}
}	
}
class Assign3_2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Marks : ");
		int typemarks=sc.nextInt();
		
		Student s1=new Student();
		System.out.println("Previous Marks : "+ s1.getmarks());
		s1.setmarks(typemarks);
		System.out.println("Current Marks : "+ s1.getmarks());
	}
}