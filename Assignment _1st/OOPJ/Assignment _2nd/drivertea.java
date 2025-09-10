//Assignment 2 - Question 1

class TeaCup{
	private String teaType;
	static int totalCups=0;
	
	public TeaCup(String teaType){
		this.teaType=teaType;
		totalCups++;
}
	public String getteaType(){
		return teaType;
	}
	
	public static void showtotalcups(){
		System.out.println(totalCups);
	}

}
class drivertea{
	public static void main(String [] args){
	TeaCup cup1 = new TeaCup("Masala Tea");
	TeaCup cup2 = new TeaCup("Green Tea");
	TeaCup cup3 = new TeaCup("Ginger Tea");
	
	System.out.println("Cup1 Type : "+ cup1.getteaType());
	System.out.println("Cup2 Type : "+ cup2.getteaType());
	System.out.println("Cup3 Type : "+ cup3.getteaType());
	
	TeaCup.showtotalcups();
	}
}