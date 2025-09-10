import java.util.Scanner;
class Qthirtyfive{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks to check your pass or fail : ");
		int num = sc.nextInt();
		
		String number = (num>=35) ? "Your pass !!" : "Your fail";
		System.out.println(number);
	}
}