import java.util.Scanner;
class Qtwentyeight{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Color ");
		String sig = sc.nextLine(); 	
		
		switch (sig){
			case "Red" :
				System.out.println("STOP");
				break;
			
			case "Yellow" :
				System.out.println("GO SLOW");
				break;
			
			case "Green" :
				System.out.println("GO");
				break;
			
			default :
				System.out.println("wrong color input.. try again : ");
		}
	}
}