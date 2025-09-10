import java.util.Scanner;
class Qthirtyone{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Welcome to comparison method : \n Enter 2 Numbers ");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt(); 	
		
		int great = (no1>no2) ? no1:no2 ;
		
		System.out.println("The gretest no is : " + great);
	}
}