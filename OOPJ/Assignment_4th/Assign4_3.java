import java.util.Scanner;
class Assign4_3{	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		try {
			System.out.println(" Enter the age.");
			int age=sc.nextInt();
			System.out.println("  age = "+age);
		}catch(Exception e){
			System.out.println(" Invalid number format " );
		}
		
		
	}
}