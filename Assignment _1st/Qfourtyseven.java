import java.util.Scanner;
class Qfourtyseven{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the No2 : ");
		int num2 = sc.nextInt();
		
		if(num1%2==0 && num2%2==0){
			System.out.println("Both are even!!");
		}
		else if(num1%2!=0 && num2%2!=0){
			System.out.println("Both are odd !!");
		}
		else if(num1%2==0 && num2%2!=0){
			System.out.println("Both are mix !!");
		}
		else if(num1%2!=0 && num2%2==0){
			System.out.println("Both are mix !!");
		}
		
	}
}