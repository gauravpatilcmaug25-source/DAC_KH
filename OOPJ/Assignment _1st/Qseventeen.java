import java.util.Scanner;
class Qseventeen{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
        int i = sc.nextInt();
		
		if(i%2==0){
			System.out.println("Divisible by 2");
			if(i%3==0){
				System.out.println("Divisible by 3");
				if(i%5==0){
					System.out.println("Divisible by 5");
				}
				else{
					System.out.println("Not Divisible by 5");
				}
			}
			else{
				System.out.println("Not Divisible by 3");
			}
		}
		else{
			System.out.println("Not Divisible by 2");
		}
		}

}