import java.util.Scanner;
class Qeleven{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		if (marks>=0 && marks<=35){
			System.out.println("Your Fail ! ");
		}
		else if (marks>= 36 && marks <= 50) {
			System.out.println("C Grade");	
		}
		else if (marks>= 51 && marks <= 65) {
			System.out.println("B Grade");	
		}
		else if (marks>= 66 && marks <= 75) {
			System.out.println("B+ Grade");	
		}
		else if (marks>= 76 && marks <= 89) {
			System.out.println("A Grade");	
		}
		else if (marks>= 90 && marks <=100) {
			System.out.println("A+ Grade");	
		}
		else {
			System.out.println("Wrong Entery !! ");
		}
	
	}
}