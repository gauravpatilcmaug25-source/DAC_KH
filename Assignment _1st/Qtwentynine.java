import java.util.Scanner;
class Qtwentynine{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number \n 1 - Weekday \n 2 - Weekend ");
		int no = sc.nextInt(); 	
		
		switch (no){
			case 1 :
				System.out.println("It’s weekday. work today. Let's Go to office ");
				break;
			
			case 2 :
				System.out.println("It’s weekend. No work today.");
				break;
				
			default :
				System.out.println("wrong input.. try again : ");
		}
	}
}