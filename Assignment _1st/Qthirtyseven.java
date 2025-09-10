import java.util.Scanner;
class Qthirtyseven{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year :");
		int year = sc.nextInt();
		
		String ye = (year % 400 ==0 || ( year % 4 == 0 && year %100 !=0)) ? "this year is leap" : "This year is not leap";
		System.out.println(ye);
	}
}