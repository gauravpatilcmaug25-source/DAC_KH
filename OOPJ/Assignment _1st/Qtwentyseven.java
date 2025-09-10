import java.util.Scanner;
class Qtwentyseven{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		char no = sc.next().charAt(0); 	
		
		switch (no){
			case 'A' :
				System.out.println("Welcome to no A");
				break;
			
			case 'B' :
				System.out.println("Welcome to no B");
				break;
			
			case 'C' :
				System.out.println("Welcome to no C");
				break;
			
			case 'D' :
				System.out.println("Welcome to no D");
				break;
				
			case 'E' :
				System.out.println("Welcome to no E");
				break;
			default :
				System.out.println("wrong input try again : ");
		}
	}
}