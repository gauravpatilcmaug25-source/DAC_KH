import java.util.Scanner;
class Assign4_9{
	public static void invalidmarksException(int marks) throws Exception{
		if(marks<0 || marks>100){
			throw new Exception ("Invalid marks");
		}
		else{
			System.out.println(" valid marks : " + marks);
		}
	}
	
	public static void main(String[]args){
		try{
			int marks=-5;
			invalidmarksException(marks);
		}catch(Exception e){
				System.out.println(e);
			}
			
	}
}
