import java.util.Scanner;
class Assign4_21{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		try{
			
			throw new Exception("Exception occurred: Invalid input");
			
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println(" Data processing completed ");
			
		}
	}
}