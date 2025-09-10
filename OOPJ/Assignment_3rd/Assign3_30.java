interface Notifyable{
    void sendNotification(String message);
} 

class Book{
  private int bookId;
  private String title;
  private String author;
	
	Book(int bookId, String title, String author){
		this.bookId=bookId;
		this.title=title;
		this.author=author;
	}	
	public int getbookid(){return bookId;}
	public String gettitle(){return title;}
	public String getauthor(){return author;}
	
	public void setbookid(int bookId){this.bookId=bookId;}
	public void settitle(String title){this.title=title;}
	public void setauthor(String author){this.author=author;}

}

abstract class LibraryMember {
  int memberId;
  String name;
  int borrowcoutn=0;
  
	    LibraryMember(int memberId, String name ){
		this.memberId=memberId;
		this.name=name;
	}
  
  abstract void borrowBook(Book Book);
} 

class StudentMember extends LibraryMember implements Notifyable{
	
	int limit=3;
	
	StudentMember(int memberId, String name){
		super(memberId,name);
	}
	
	void borrowBook(Book Book){
		if(borrowcoutn < limit){
			borrowcoutn++;
			System.out.println("Student Member " + name + " borrowed: " + Book.gettitle());
		}
		else{
			System.out.println("Student Member " + name + " cannot borrow more than " + limit + " books.");
		}
	}
		@Override
		public void sendNotification(String msg){
			 System.out.println("Notification sent to " + name + ": " + msg);
		}
}
class FacultyMember extends LibraryMember implements Notifyable{
	int limit =5;
	FacultyMember(int memberId, String name){
		super(memberId,name);
	}
	
	void borrowBook(Book Book){
		if(borrowcoutn<limit){
			borrowcoutn++;
			System.out.println("FacultyMember " + name + "Borrowed " + Book.gettitle());
		}
		else{
			System.out.println("Faculty Member " + name + " cannot borrow more than " + limit + " books.");
		}
	}
	@Override
	public void sendNotification(String msg){
		System.out.println("Notification sent to " + name + ": " + msg);
	}
} 

class Assign3_30{

public static void main(String[]args){
		Book b1=new Book(101,"ramkirani","GJ.Rajan");
		Book b2=new Book(201,"HumTum","Ramraj");
		Book b3=new Book(301,"Animal ","Shamani");
		Book b4=new Book(401,"Hustle the story","BB ki Wins");
		Book b5=new Book(501,"Mahan Raja","Ashish chanclani");
		Book b6=new Book(601,"Cofounders","Gaurav");
		
		StudentMember s1=new StudentMember(557,"Gaurav");
		FacultyMember f1=new FacultyMember(951,"Aditya Sir");
		
		s1.borrowBook(b1);
		s1.borrowBook(b5);
		System.out.println("Student Member "+ s1.name + "borrowed "+ s1.borrowcoutn +"books ");
		
		f1.borrowBook(b3);
		f1.borrowBook(b6);
		f1.borrowBook(b5);
		System.out.println("Student Member "+ s1.name + "borrowed "+ s1.borrowcoutn +"books ");
		
		s1.sendNotification("Submit book's in next 7 days");
		f1.sendNotification("Submit book's in next 20 days");
		
	}
}