import java.util.Scanner;
class Assign4_4{	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int emp[]={5000,6000};
		
		try {
			
				try{
					int hrwage = emp[1]/0;
					System.out.println(" Daily wage : "+ hrwage);
				}
				catch(ArithmeticException e){
					System.out.println(" Division by zero ");
				}
		}catch( ArrayIndexOutOfBoundsException e){
			System.out.println(" Invalid index " );
		}
	}
}