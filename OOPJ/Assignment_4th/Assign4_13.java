import java.util.Scanner;
class Assign4_13{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Notification wanna Modify. ");
		String noti=sc.nextLine();
		
		StringBuilder sb=new StringBuilder(noti);
		
		sb.reverse();
		System.out.println(sb);
		
	}
}