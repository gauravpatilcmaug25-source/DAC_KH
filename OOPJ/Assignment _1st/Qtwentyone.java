import java.util.Scanner;
class Qtwentyone{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int no = sc.nextInt();
		
		String day = (no==1) ? "Sunday"
					:(no==2) ? "Monday"
					:(no==3) ? "Tuesday"
					:(no==4) ? "Wednesday"
					:(no==5) ? "Thursday"
					:(no==6) ? "Friday"
					:(no==7) ? "Saturday"
					:"Invlaid Day ";
					
		System.out.println(day);
		
	}
}