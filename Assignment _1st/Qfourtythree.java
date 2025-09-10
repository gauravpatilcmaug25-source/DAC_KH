import java.util.Scanner;
class Qfourtythree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No1 : ");
		int num = sc.nextInt();
		
		int sum=0;
		while(num>0){
			int digit = num%10;
			sum +=digit;
			num /= 10;			
		}
		System.out.println(sum);
		
    }   
}
