import java.util.Scanner;

class Qeight{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		System.out.println("Enter the Billing Amount : ");
		int bill = sc.nextInt();
		
		if(bill >= 1000){
			int dis = bill*10/100;
			int fbill = bill - dis;
			System.out.println("Your Bill is "+ bill + "\nYou Have Got Discount Of : Rs" + dis + "\nYour Final bill is " + fbill);
		}
		else {
			System.out.println("Sorry You cant get discoutn.\n shop for more");
		}
	}
}