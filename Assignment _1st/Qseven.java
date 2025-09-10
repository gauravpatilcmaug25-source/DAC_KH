import java.util.Scanner;
class Qseven{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		if (marks>=0 && marks<=35){
			System.out.println("Your Fail ! ");
		}
		else if (marks>= 36 && marks <= 100) {
			System.out.println("Your Pass !!! ");	
		}
		else {
			System.out.println("Wrong Entery !! ");
		}
	
	}
}