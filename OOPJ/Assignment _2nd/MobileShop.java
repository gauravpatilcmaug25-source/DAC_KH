//Assignment 2 - Question 2
import java.util.Scanner;

class Mobile{
	private String model;
	static int count=0;
	
	public Mobile(String model){
		this.model=model;
		count++;
	}
	public String getmodel(){
		return model;
	}
	
	public static void display(){
		System.out.println("Total Mobile are : "+count);
	}
}
class MobileShop{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Mobile models 2 : ");
		String mod1 = sc.nextLine();
		String mod2 = sc.nextLine();
		
	Mobile m1 =new Mobile(mod1);
	Mobile m2 =new Mobile(mod2);
	
	System.out.println("Model 1 is : "+ m1.getmodel());
	System.out.println("Model 2 is : "+ m2.getmodel());
	
	Mobile.display();
}
}

