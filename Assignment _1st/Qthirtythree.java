import java.util.Scanner;
class Qthirtythree{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check odd even :  ");
		int num = sc.nextInt();
		
		String number = (num%2==0) ? "Number is Even !!"
						:(num%2 !=0) ? "Number is odd "
						:"Number is 0";
		
		System.out.println(number);
	}
}