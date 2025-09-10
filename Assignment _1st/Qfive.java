import java.util.Scanner;
class Qfive{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length & Breadth of Gardern : ");
		int len = sc.nextInt();
		int brd = sc.nextInt();
		
		if (len == brd){
			System.out.println("its an Square Gurdan ");
		}
		else {
			System.out.println("its and rectangle ");	
	}
	}
}