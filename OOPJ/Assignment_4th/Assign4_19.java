import java.util.Scanner;
class Assign4_19{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Notification wanna Modify. ");
		String noti=sc.nextLine();
		
		System.out.println(" Enter the Data you wanna change. ");
		String withchange=sc.nextLine();
		
		System.out.println(" Enter the Data you wanna put for replacement. ");
		String newr=sc.nextLine();
				
		StringBuffer sb=new StringBuffer(noti);
		
		int index=sb.indexOf(withchange);
		
		
		if(index!=-1){
		sb.replace(index, index+withchange.length(),newr);
		System.out.println(sb);
		}
	}
}