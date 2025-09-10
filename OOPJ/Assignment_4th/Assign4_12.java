import java.util.Scanner;
class Assign4_12{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Notification wanna Modify. ");
		String noti=sc.nextLine();
		
		System.out.println(" Enter the Notification wanna Delete. ");
		String delet=sc.nextLine();
		
		StringBuilder sb=new StringBuilder(noti);
		
		int index =sb.indexOf(delet);
		
		if(index != -1){
			sb.delete(index,index+delet.length());
			System.out.println(sb);
		}
		else{
			System.out.println(" Something went wrong... ");
		}
		
	}
}