class test{
	static int counter = 0;
	
	void show(){
		System.out.println(counter++);
	}


}

class testdemo{
	int a;6
	private String name;
	
	void display(){
		System.out.println("a - "+a);
		System.out.println("Name - "+name);

	}
	
	public static void main(String[]args){
		
		testdemo t1 = new testdemo();
		t1.a=100;
		t1.name="prajwal";
		t1.display();
	}
}