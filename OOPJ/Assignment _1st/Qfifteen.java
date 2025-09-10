import java.util.Scanner;
class Qfifteen{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
        int num = sc.nextInt();
		
		int d1 = num/1000;
		int d2 = (num/100)%10;
		int d3 = (num/10)%10;
		int d4 = num%10;
		
		if((d1+d2) == (d3+d4)){
			System.out.println("Lucky Number");
		}
		else{
			System.out.println("Not Lucky Number");
		}
		}
	}