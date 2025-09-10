import java.util.Scanner;
class Assign4_18{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Tickit Number ");
		long noti=sc.nextLong();
				
		StringBuffer sb=new StringBuffer(String.valueOf(noti));
	
		sb.reverse();
		System.out.println(sb);
		
	}
}