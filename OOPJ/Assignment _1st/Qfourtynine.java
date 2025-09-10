import java.util.Scanner;
class Qfourtynine{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Year : ");
		int year = sc.nextInt();
		
		System.out.println("Enter the Month : ");
		int month = sc.nextInt();
		
		if(month == 2 && (year%4==0 || (year%100 != 0 && year%400==0))){
			System.out.println("Feb == 29 Day's");
		}
		else {
			if (month==1){
				System.out.println("Jan == 31 Days");
			}
			else if (month==2){
				System.out.println("Feb== 28 Days");
			}
			else if (month==3){
				System.out.println("Mar== 31 Days");
			}
			else if (month==4){
				System.out.println("Apr== 30 Days");
			}
			else if (month==5){
				System.out.println("May== 31 Days");
			}
			else if (month==6){
				System.out.println("June== 30 Days");
			}
			else if (month==7){
				System.out.println("Jully== 31 Days");
			}
			else if (month==8){
				System.out.println("Aug== 31 Days");
			}
			else if (month==9){
				System.out.println("Sep== 30 Days");
			}
			else if (month==10){
				System.out.println("Oct== 31 Days");
			}
			else if (month==11){
				System.out.println("Nov== 30 Days");
			}
			else if (month==12){
				System.out.println("Dec== 31 Days");
			}
		}
		
		}
}