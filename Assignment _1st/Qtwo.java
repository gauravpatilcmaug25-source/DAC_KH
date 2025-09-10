import java.util.Scanner;
class Qtwo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("\n \t HEYY!! Let's Check BEST offer for YOY !! "); System.out.println();
	
	System.out.println("Enter the Offer from Company 1 Salary : "); int s1 = sc.nextInt();
	
	System.out.println("Enter the Offer from Company 2 Salary : ");
	int s2 = sc.nextInt();
	
	System.out.println("Enter the offer from Company 3 Salary  ");
	int s3 = sc.nextInt();
	
	
	
	if(s1>s2 && s1> s3 ){
		System.out.println("\n Compnay 1 is Giving Highest Salary !! ");
	}
	else if(s2>s1 && s2>s3) {
		System.out.println("\n Compnay 2 is Giving Highest Salary !! ");
	}
	else {
		System.out.println("\n Compnay 3 is Giving Highest Salary !! ");
	}
	}
}