import java.util.Scanner;
class Qfifty{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		if(num%2==0){
			System.out.println("DIVISIBLE BY 2 ");
			if(num%3==0){
				System.out.println("DIVISIBLE BY 3 ");
			}
				if(num%5==0){
				System.out.println("DIVISIBLE BY 5 ");
				}
		}
		else if(num%3==0){
				System.out.println("DIVISIBLE BY 3 ");
			}
				if(num%5==0){
				System.out.println("DIVISIBLE BY 5 ");
				}
		else if(num%5==0){
				System.out.println("DIVISIBLE BY 5 ");
				}
}
}