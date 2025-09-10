abstract class Shape{
	public abstract int area();
}

class Rectangle extends Shape{
	private int l,b;
	
	Rectangle(int l, int b){
		this.l=l;
		this.b=b;
	}

	@Override
	public int area(){
		return l*b;
	}
}

class Circle extends Shape{
	private int r;
	Circle(int r){
		this.r=r;
	}
	
	@Override
	public int area(){
		return (int)(3.14*(r*r));
	}
}

class Assign3_6{
	public static void main(String[]args){
		Shape rec=new Rectangle(10,7);
		Shape cir=new Circle(7);
		
		System.out.println(" The area of Rectangle is : " + rec.area());
		System.out.println(" The area of Rectangle is : " + cir.area());
		
	}
}