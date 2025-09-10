import java.util.Scanner;
class Qtwentytwo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int no = sc.nextInt();
		
		string month = (no==1) ? "Jan"
						:(no==2) ? "Feb"
						:(no==3) ? "March"
						:(no==4) ? "Apr"
						:(no==5) ? "May"
						:(no==6) ? "June"
						:(no==7) ? "July"
						:(no==8) ? "Aug"
						:(no==9) ? "sep"
						:(no==10) ? "Oct"
						:(no==11) ? "Nov"
						:(no==12) ? "Dec"
						:"Invlaid Choice";
						
		System.out.println(month);				
	}	
}