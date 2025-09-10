import java.util.Scanner;

class Qten{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		System.out.println("Enter the total classes : ");
		int tclass = sc.nextInt();
		
		System.out.println("Enter the Attended classes : ");
		int pres = sc.nextInt();
		
		int atten = (pres * 100) / tclass;
		
		if(atten > 75){
			
			System.out.println("Your allowed for exam ");
		}
		else {
			System.out.println("Your not allowed. Try next time");
		}
	}
}