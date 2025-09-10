import java.util.Scanner;
class Assign4_5{	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		String product[]={"Laptop","Mouse","Keyboard","Monitor"};
		double price[]={299.99, 499.99, 199.99};
		
		try {
				System.out.println("Enter the Product Price. in between 0 to 2 ");
				int i=sc.nextInt();
				
				System.out.println("Enter the Product Quantity. Should be more than 0");
				int j=sc.nextInt();
				
				if(j<=0){
					throw new IllegalArgumentException("Invalid Quantity");
				}
				
					double bill = price[i]*j;
					System.out.println(" Bill : "+ bill);
		}			
		catch(ArrayIndexOutOfBoundsException e){
				System.out.println(" OUT OF BOUND PRICE ");
			}
		catch( IllegalArgumentException e){
			System.out.println(" Invalid Quantity " );
		}
	}
}