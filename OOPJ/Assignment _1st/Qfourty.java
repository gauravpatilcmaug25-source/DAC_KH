import java.util.Scanner;
class Qfourty{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total bill : ");
		int bill = sc.nextInt();
		
		int dis = (bill>1000) ? (bill/100*10) : 0;
		System.out.println("Total bill = "+ bill + "\n Discount" + dis + "\nTotal Bill = " + (bill - dis));
		
		
	}
}