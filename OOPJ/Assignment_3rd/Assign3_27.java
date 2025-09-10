interface Shape{
 void calculateArea();
}
class Circle implements Shape{
	int radius;
	Circle(int radius){
		this.radius=radius;
	}
	//@Override
	public void calculateArea(){
		System.out.println(" Area of Circle  => " + ((22.0/7)*radius*radius));
	}
}

class Rectangle implements Shape{
	int length; int breath;
	Rectangle(int length, int breath){
		this.length=length;
		this.breath=breath;
	}
	//@Override
	public void calculateArea(){
		System.out.println(" Area of Rectangle  => " + (length*breath));
	}
}

class Square implements Shape{
	int side;
	Square(int side){
		this.side=side;
	}
	//@Override
	public void calculateArea(){
		System.out.println(" Area of Square  => " + (side*side));
	}
} 

class Assign3_27{
	public static void main(String[]args){
		Circle c1=new Circle(10);
		Rectangle r1=new Rectangle(5,4);
		Square s1=new Square(25);
		
		c1.calculateArea();
		r1.calculateArea();
		s1.calculateArea();
	}
}