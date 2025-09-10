import java.util.Scanner;
class Qtwelve{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age of Friend 1 : ");
		int a1 = sc.nextInt();
		System.out.println("Enter Age of Friend 2 : ");
		int a2 = sc.nextInt();
		System.out.println("Enter Age of Friend 3 : ");
		int a3 = sc.nextInt();
		
		if(a1>a2 && a1>a3){
			System.out.println("Friend 1 is Elder");
		}
		else if(a2>a1 && a2>a3){
			System.out.println("Friend 2 is Elder");
		}
		else{
			System.out.println("Friend 3 is Elder");
		}
	
	}
}