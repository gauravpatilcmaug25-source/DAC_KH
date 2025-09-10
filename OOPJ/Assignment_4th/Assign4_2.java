import java.util.Scanner;
class Assign4_2{	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int arr[]={25,35,41,85};
		
		try {
			System.out.println(" Score " + arr[3] );
			System.out.println(" Score " + arr[6] );
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(" Invalid index accesed " );
			
		}
		
		
	}
}