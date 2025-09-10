class EBook {
	private int bookId;
	private String title; 
	private String author;
	
	EBook(int bookId, String title, String author){
		this.bookId=bookId;
		this.title=title;
		this.author=author;
	}
//geterseter
	public int getbookid(){
		return bookId;
	}
	public void setbookid(int bookId){
		this.bookId=bookId;
	}
	
	public String gettitle(){
		return title;
	}
	public void settitle(String title){
		this.title=title;
	}
	
	public String getauthor(){
		return author;
	}
	public void setauthor(String author){
		this.author=author;
	}
	public void bookdetail(){
	System.out.println(" Name : "+bookId+" title = "+title+" Author = "+author);
	}
}	
	class library{
		static int totalBooks=0;
		
		public void addBook(EBook b){
		totalBooks++;
	}
	public static void displayTotalBooks() {
		System.out.println("The total book count is : "+totalBooks);
	}
	}
class Addlib{
		public static void main(String[]args){
			
			library lib = new library();
			
			EBook b1=new EBook(11,"the secret","ganpat pande");
			EBook b2=new EBook(21,"the power","ram sham");
			
			lib.addBook(b1);
			lib.addBook(b2);
			
			b1.bookdetail();
			b2.bookdetail();
			
			library.displayTotalBooks();
}
}