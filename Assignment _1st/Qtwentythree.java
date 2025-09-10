import java.util.Scanner;
class Qtwentythree{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int no1 = sc.nextInt();
		System.out.println("Enter the Number ");
		int no2 = sc.nextInt();
		System.out.println("Enter the Number ");
		char op = sc.next().charAt(0);
		double result;
		
	switch (op){
		case '+':
				result = no1 + no2;
				System.out.println(result);
				break;
		case '-':
				result = no1-no2;
				System.out.println(result);
				break;
		case '*':
				result = no1*no2;
				System.out.println(result);
				break;
		case '/':
				result = no1/no2;
				System.out.println(result);
				break;
		default :
				System.out.println("Wrong input !! Try again ");
	}
	}
}