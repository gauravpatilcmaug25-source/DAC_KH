import java.util.Scanner;

class Qfour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t Hii 🖐!! Welcome to the Locker Room  ");
		
        System.out.println("\n \t Enter the Locker Number : ");
        int lcr = sc.nextInt();
		
		if(lcr % 2 == 0){
			System.out.println("Its Even");
		}
		else{
			System.out.println("Its Odd");
		}
    }
}
