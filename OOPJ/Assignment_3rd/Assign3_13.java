abstract class shape{
	abstract void display();
}

class circle extends shape{
	int radius;
	circle(int radius){
		this.radius=radius;
	}
	@Override
	public void display(){
		System.out.println(" Drawing Circle of radius = "+radius);
	}
}

class rectangle extends shape{
	int lng; int brd;
	rectangle(int lng, int brd){
		this.lng=lng;
		this.brd=brd;
	}
	@Override
	public void display(){
		System.out.println(" Drawing Rectangle of length " +lng + " and breadth = "+ brd);
	}
}

class Assign3_13{
	public static void main(String[]args){
		shape cr=new circle(22);
		shape tri=new rectangle(10,5);
		
		cr.display();
		tri.display();
	}
}