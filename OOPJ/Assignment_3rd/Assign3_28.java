interface discountabel{
	void applyDiscount(double percentage);
}
abstract class cartitem{
	abstract double calculatetotalprice();
}

class product{
	private int productid;
	private String name;
	private int price;
	
	product(int productid, String name, int price){
		this.productid=productid;
		this.name=name;
		this.price=price;
	}
	//getset for productid
	public int getid(){ return productid; }
	public void setid(int productid){ this.productid=productid; }
	//getset for name
	public String getname(){ return name; }
	public void setname(String name){ this.name=name; }
	//getset for price
	public int getprice(){ return price; }
	public void setprice(){ this.price=price; }
}

class cart extends cartitem implements discountabel{
	private product p1,p2,p3;
	
	public void  addprod(product p1, product p2, product p3){
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
	}
	
	@Override
		public void applyDiscount(double percentage){
			if(p1!=null){
				double oldp=p1.getprice();
				double newp=oldp-(oldp*percentage/100);
				System.out.println("Applying " + percentage + "% discount to " + p1.getname());
				System.out.println("Before Discount = " + oldp + "After discount " + newp);
			}
		}
		@Override
		double calculatetotalprice(){
			return p1.getprice()+p2.getprice()+p3.getprice();
		}
}

class Assign3_28{
	public static void main(String[]args){
		product prod1=new product(4512,"Mouse",5000);
		product prod2=new product(7894,"Laptop",60000);
		product prod3=new product(3265,"Keyboard",10000);
		
		cart c=new cart();
		c.addprod(prod1,prod2,prod3);
		
		c.applyDiscount(10);
		
		System.out.println("Total Cart Price = "+c.calculatetotalprice());
	}
}
