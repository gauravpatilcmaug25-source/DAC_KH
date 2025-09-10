import java.util.Scanner;
class Qthirtyeight{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year :");
		char ch = sc.next().charAt(0);
		
		String vo = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
					 || ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') ? "Its vowel" : "Not vowel";
		System.out.println(vo);
	}
}