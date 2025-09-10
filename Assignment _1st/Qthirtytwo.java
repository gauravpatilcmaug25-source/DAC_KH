import java.util.Scanner;
class Qthirtytwo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int no1 = sc.nextInt();
		
		String great = (no1>0) ? "Num is +ve" 
					    :(no1<0) ? "Num is -ve" 
					    :"No is 0";
						
		
		System.out.println(great);
	}
}