import java.util.Scanner;
class Qsix{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int year = sc.nextInt();
		
		if ((year %4==0 || year % 400 == 0) && (year % 100 !=0)){
			System.out.println("its an Leap Year ");
		}
		else {
			System.out.println("its Not Leap Year ");	
	}
	}
}