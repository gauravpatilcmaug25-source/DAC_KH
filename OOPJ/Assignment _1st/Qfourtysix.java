import java.util.Scanner;
class Qfourtysix{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No1 : ");
		char ch = sc.next().charAt(0);
		
		if(ch >= 'a' && ch<='z' || ch>='A' && ch<='Z'){
			System.out.println("Its an Alphabate !!");
		}
		else if(ch>='0' &&ch<='9'){
			System.out.println("Its an Digit !!");
		}
		else if(ch== '+' || ch=='-' || ch=='%'){
			System.out.println("Its an Special char !!");
		}
		
	}
}