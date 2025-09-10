import java.util.Scanner;
class Qfourtyfour 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No1 : ");
		int num = sc.nextInt();
		
		int og = num;
		int rev=0;
		while(num>0){
			int digit = num%10;
			rev = rev*10+digit;
			num /= 10;			
		}
		System.out.println(rev);
		if(rev==og){
			System.out.println("Its palindrom");
		}
		else{
			System.out.println("Its Not palindrom");
		}
    }   
}
