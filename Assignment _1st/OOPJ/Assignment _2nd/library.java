//Assignment 2 - Question 3
class Book{
	String title;
	String author;
	boolean issued;
	static int totalIssuedBooks=0;
// Constructor	
	public Book(String title, String author, boolean issued){
		this.title=title;
		this.author=author;
		this.issued=issued;
		
		if(issued==true){
			totalIssuedBooks++;
		}
	}
//	setget for title
	public String gettitle(){
		return title;
	}
	public void settitle(String title){
		this.title=title;
	}

//  setget for author
	public String getauthor(){
		return author;
	}
	public void setauthor(String author){
		this.author=author;
	}
	
// setget for issued
	public boolean getissued(){
		return issued;
	}
	public void getissued(boolean issued){
		if (!this.issued && issued) {
            totalIssuedBooks++;
        }
        // If changing from issued to not issued
        else if (this.issued && !issued) {
            totalIssuedBooks--;
        }
        this.issued = issued;
	}
	
	public static void display(){
		System.out.println(totalIssuedBooks);
	}
}	


class library{
	public static void main(String[]args){
		Book b1 = new Book("Romeo","ganpat",false);
		Book b2 = new Book("July","Ramukaka",false);
		Book b3 = new Book("Roju","Shamu",true);
		
		System.out.println("BOOK Details - \n Name :" + b1.gettitle() + "\n Author = " + b1.getauthor() + "\n Issue ="+ b1.getissued() + "\n");
		System.out.println("BOOK Details - \n Name :" + b2.gettitle() + "\n Author = " + b2.getauthor() + "\n Issue ="+ b2.getissued() + "\n");
		System.out.println("BOOK Details - \n Name :" + b3.gettitle() + "\n Author = " + b3.getauthor() + "\n Issue ="+ b3.getissued() + "\n");
		
		Book.display();
	}
}