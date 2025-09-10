import java.util.Scanner;
class Qfourtyeight{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Marks : ");
		int marks = sc.nextInt();
		
		if(marks >=85){
			System.out.println("Grade == A");
		}
		else if(marks>=75 && marks<=84){
			System.out.println("Grade == A-");
		}
		else if(marks>=59 && marks <=74){
			System.out.println("Grade == B");
		}
		else if(marks>=35 && marks<=58){
			System.out.println("Both are mix !!");
		}
		
	}
}