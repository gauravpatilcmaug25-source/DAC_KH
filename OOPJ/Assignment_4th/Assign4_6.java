import java.util.Scanner;
class Assign4_6{	

	static class AgeNotValidException extends Exception{
		public AgeNotValidException(String msg){
			super(msg);
		}
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Age : ");
		int age=sc.nextInt();
		
		try{
			register(age);
			System.out.println("Registration Successfullllll.....");
		}catch(AgeNotValidException e){
			System.out.println(e);
		}
	}
	public static void register(int age) throws AgeNotValidException {
			if(age<18){
				throw new AgeNotValidException ("Your not eligible. Age must be >= 18. ");
			}
}
	}