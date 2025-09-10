import java.util.Scanner;
class Qeighteen{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the day Number : ");
        int num = sc.nextInt();
		
		if(num == 1){
			System.out.println("SUNDAY");
		}
		
		else if(num == 2){
			System.out.println("MONDDAY");
		}
		
		else if(num == 3){
			System.out.println("TUESDAY");
		}
		
		else if(num == 4){
			System.out.println("WEDNESDAY");
		}
		
		else if(num == 5){
			System.out.println("THURSDAY");
		}
		
		else if(num == 6){
			System.out.println("FRIDAY");
		}
		
		else if(num == 7){
			System.out.println("SATURDAY");
		}
		
		else{
			System.out.println("Wrongs Entry");
		}
		
	}
}