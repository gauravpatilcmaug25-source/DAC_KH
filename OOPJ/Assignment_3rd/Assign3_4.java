class library{
	private int copiesAvailable;
	
	library(){
		this.copiesAvailable=0;
	}
	
	public void addCopies(int n){
		copiesAvailable=copiesAvailable+n;
	}
	public void removeCopies(int n){
		copiesAvailable=copiesAvailable-n;
	}
	
public int getCopiesAvailable(){
	return copiesAvailable;
}	
}

class Assign3_4{
	public static void main(String[]args){
			library b1=new library();
			library b2=new library();
			System.out.println("Available Books are : " + b1.getCopiesAvailable());
			b1.addCopies(3);
			System.out.println("Available Books are : " + b1.getCopiesAvailable());
			b1.removeCopies(1);
			System.out.println("Available Books are : " + b1.getCopiesAvailable());
	}
}