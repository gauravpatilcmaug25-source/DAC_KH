import java.util.Scanner;
class Qthirtynine{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary & Year of experience : ");
		int sal = sc.nextInt();
		int exp = sc.nextInt();
		
		double bonus=(exp>5)? (sal * 0.05) : 0;
		System.out.println("Bonus : " + bonus);
	}
}