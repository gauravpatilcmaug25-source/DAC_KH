import java.util.Scanner;
class Assign4_17{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Notification wanna Modify. ");
		String noti=sc.nextLine();
		
		System.out.println(" Enter the Data you wanna delete. ");
		String del=sc.nextLine();
				
		StringBuffer sb=new StringBuffer(noti);
		
		int index=sb.indexOf(del);
		
		
		if(index!=-1){
		sb.delete(index, index+del.length());
		System.out.println(sb);
		}
	}
}