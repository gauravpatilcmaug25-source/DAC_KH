import java.util.Scanner;
class Assign4_16{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Notification wanna Modify. ");
		String noti=sc.nextLine();
		
		System.out.println(" Enter the Data you wanna add. ");
		String add=sc.nextLine();
		
		System.out.println(" Enter the at which you wanna add . ");
		int i=sc.nextInt();
		
		StringBuffer sb=new StringBuffer(noti);
		sb.insert(i, add + " ");
		System.out.println(sb);
	}
}