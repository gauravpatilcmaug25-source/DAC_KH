import java.util.Scanner;
class Qfourtyone{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		int og = num;
		int sum =0;
		
		while(num>0){
			int digit = num % 10; 
			sum += (digit * digit * digit);
			num /= 10;
		}
		if(sum == og){ 	
			System.out.println("It's Armstrong Number !!");
		}
		else{
			System.out.println("It's Not Armstrong Number !!");
		}
	}
}