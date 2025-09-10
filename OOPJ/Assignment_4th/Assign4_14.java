import java.util.Scanner;
class Assign4_14{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Notification wanna Modify. ");
		String noti=sc.nextLine();
		
		System.out.println(" Enter the Notification wanna Delete. ");
		String add=sc.nextLine();
		
		StringBuilder sb=new StringBuilder(noti);
		
		int index =sb.indexOf("Report");
		
		if(index != -1){
			sb.insert(index,index+ add + " ");
			System.out.println(sb);
		}
		else{
			System.out.println(" Something went wrong... ");
		}
		
	}
}