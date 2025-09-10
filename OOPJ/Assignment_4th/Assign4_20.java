import java.util.Scanner;
class bankac{
	private final int accID;
	private String name;
	
	bankac(int accID, String name){
		this.accID=accID;
		this.name=name;
	}
	
	public int getaccID(){
		return accID;
	}
	public void setaccID(){
		this.accID=accID;
	}
	
	public String getname(){
		return name;
	}
	public void setname(){
		this.name=name;
	}
	
	public void display(){
		System.out.println("Account ID : " + accID + "HolderName : " + name);
	}
	
}
class Assign4_20{
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		bankac acc=new bankac(101,"Gaurav");
		
		acc.display();
	}
}