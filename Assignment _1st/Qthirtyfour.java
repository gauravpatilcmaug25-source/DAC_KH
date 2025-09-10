import java.util.Scanner;
class Qthirtyfour{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check your eligbility for voting :  ");
		int num = sc.nextInt();
		
		String number = (num>=18) ? "You can vote !!" : "You cannot vote";
		System.out.println(number);
	}
}