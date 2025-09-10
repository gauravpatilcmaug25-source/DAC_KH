import java.util.Scanner;
class Qnine{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Salary : ");
		int sal = sc.nextInt();
		
		System.out.println("Enter the Years of Service : ");
		int ser = sc.nextInt();
		
		if(ser >= 5){
			int bonus = sal*5/100;
			System.out.println("Your Bonus Amt is " + bonus);
		}
		else {
			System.out.println("You need more experience ");
		}
	}
}