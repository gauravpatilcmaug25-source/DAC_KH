import java.util.Scanner;
class Assign4_1{
	
	public static void bouns(int amt, int emp){
		try{
			int perbounus=amt/emp;
			System.out.println(" Each Employee get : " + perbounus);
		}catch(ArithmeticException e){
			System.out.println("Ther are no employee. | Error: Division by zero not allowed " + e);
		}
	}
		
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Amount... ");
		int amt=sc.nextInt();

		System.out.println(" Enter the number of Employee.... ");
		int emp=sc.nextInt();
		
		bouns(amt,emp);
		
	}
}