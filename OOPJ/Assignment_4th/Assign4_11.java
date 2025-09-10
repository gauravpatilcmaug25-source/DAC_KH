import java.util.Scanner;
class Assign4_11{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Notification wanna Modify. ");
		String noti=sc.nextLine();
		
		System.out.println(" Enter the Notification wanna Modify. ");
		String tochange=sc.nextLine();
		
		System.out.println(" Enter the Notification wanna Modify. ");
		String towith=sc.nextLine();
		
		StringBuilder sb=new StringBuilder(noti);
		
		int index =sb.indexOf(tochange);
		
		if(index != -1){
			sb.replace(index,index+tochange.length(), towith);
			System.out.println(sb);
		}
		else{
			System.out.println(" Something went wrong... ");
		}
		
	}
}
