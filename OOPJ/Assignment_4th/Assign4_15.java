import java.util.Scanner;
class Assign4_15{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Notification wanna Modify. ");
		String noti=sc.nextLine();
		
		System.out.println(" Enter the Data you wanna add. ");
		String add=sc.nextLine();
		
		StringBuffer sb=new StringBuffer(noti);
		sb.append(" ").append(add);
		System.out.println(sb);
	}
}