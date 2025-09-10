class bankname{
	private static String NameofBank = "CDAC Bank";
	
	public static void displayBankName(){
		System.out.println(NameofBank);
	}
}
class namebank{
		public static void main(String[]args){
			bankname c1= new bankname();
		
		c1.displayBankName();
}
}