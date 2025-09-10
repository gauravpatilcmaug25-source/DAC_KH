import java.util.Scanner;
class employees{
	private int age;

public int getage(){
	return age;
}
public void setage(int age){
	if(age>=18){
		this.age=age;
	}
	else{
		System.out.println(" Your under 18 :");
	}
}

}
class Assign3_3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		int typeage=sc.nextInt();
		
		employees e1=new employees();
		e1.setage(typeage);
		System.out.println("Employee 1 age is = "+e1.getage());
	}
}