import java.util.Scanner;
class Qthirty{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Welcome to Basic Arithmatic Calculator : \n Enter the Numbers ");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt(); 	
		System.out.println("Enter Your Operaion Number : \n 1.Additon 2.Substraction 3.Multiplication 4.Division");
		int op = sc.nextInt();
		switch (op){
			case 1 :
				System.out.println("Your Addition is " + no1 + no2);
				break;
			
			case 2 :
				System.out.println("Your Substraction is " + (no1 - no2));
				break;
			
			case 3 :
				System.out.println("Your Multiplication is " + no1 * no2);
				break;
			case 4 : 
				System.out.println("Your Division is " + no1 / no2);
				break;
			default :
				System.out.println("wrong input.. try again : ");
		}
	}
}