import java.util.Scanner;
class Qone{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Mock Test 1 Marks : ");
	int m1 = sc.nextInt();
	
	System.out.println("Enter the Mock Test 2 Marks : ");
	int m2 = sc.nextInt();
	
	if(m1>m2){
		System.out.println("Your Module 1 marks are Higher !! ");
	}
	else {
		System.out.println("Your Module 2 marks are Higher !!");
	}
	}
}