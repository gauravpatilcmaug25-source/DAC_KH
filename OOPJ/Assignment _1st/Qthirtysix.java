import java.util.Scanner;
class Qthirtysix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no1 :");
		int a = sc.nextInt();
		
		System.out.println("Enter no2 :");
		int b = sc.nextInt();
		
		System.out.println("Enter no3 :");
		int c = sc.nextInt();
		
		int great = (a>b) ? ((a>c) ? a:c)
							:((b>c) ? b:c);
		
		
		System.out.println(great);
	}
}