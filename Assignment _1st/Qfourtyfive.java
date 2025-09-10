import java.util.Scanner;
import java.util.Arrays;
class Qfourtyfive{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int[] arr=new int[3];
		
		
		System.out.println("Enter the No1 : ");
		arr[0] = sc.nextInt();
		
		System.out.println("Enter the No2 : ");
		arr[1] = sc.nextInt();
		
		System.out.println("Enter the No3 : ");
		arr[2] = sc.nextInt();
		
		Arrays.sort(arr);
		
		System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
		
		
	}
}