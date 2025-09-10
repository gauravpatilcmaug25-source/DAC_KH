class ShapeArea{
	
	public void calculateArea(int side){
		System.out.println(" The area of SQUARE is : " + side*side);
	}
	public void calculateArea(int length, int breadth){
		System.out.println(" The area of RECTANGLE is : " + length*breadth);
	}
	public void calculateArea(double radius){
		System.out.println(" The area of CIRCLE is : " + (radius*radius*(22.0/7)));
	}
}

class Assign3_15{
	public static void main(String[]args){
		ShapeArea NEWSHAPE=new ShapeArea();
		
		NEWSHAPE.calculateArea(5);
		NEWSHAPE.calculateArea(4,6);
		NEWSHAPE.calculateArea(3.0);
	}
}