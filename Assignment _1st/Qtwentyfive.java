import java.util.Scanner;
class Qtwentyfive{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int no = sc.nextInt();
		
		switch (no){
			case 1 :
				System.out.println("Welcome to no 1");
				break;
			
			case 2 :
				System.out.println("Welcome to no 2");
				break;
			
			case 3 :
				System.out.println("Welcome to no 3");
				break;
			
			case 4 :
				System.out.println("Welcome to no 4");
				break;
			
			case 5 :
				System.out.println("Welcome to no 5");
				break;
			default :
				System.out.println("wrong input try again : ");
		}
	}
}