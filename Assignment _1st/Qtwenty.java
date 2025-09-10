import java.util.Scanner;
class Qtwenty{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number 1 : ");
        int num1 = sc.nextInt();
		
		System.out.println("Enter the Number 2 : ");
        int num2 = sc.nextInt();
		
		System.out.println("Enter Your choice : \n  > +   > -   > *   > /   :");
        char op = sc.next().charAt(0);
		
		if(op == '+'){
			System.out.println("Additon of 2 no is : " + num1 + num2);
		} else {
			if(op == '-'){
				System.out.println("Additon of 2 no is : " + (num1 - num2));
			}else{
				if(op == '*'){
				System.out.println("Multiplication of 2 no is : " + num1 * num2);
			}else{
				if(op == '/'){
				System.out.println("Multiplication of 2 no is : " + num1 / num2);
				}
			else {
				System.out.println("Something went wrong !!  ");
			}
		}
	}
}
}
}