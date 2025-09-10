class Animal{
	public void makeSound(){
	System.out.println(" Animals are Eating.....");
	}
}

class Dog extends Animal{
	@Override
	public void makeSound(){
	System.out.println(" Dog is Barking.....");
	}
}

class Cat extends Animal{
	@Override
	public void makeSound(){
		System.out.println(" CAT is meowing.....");
	}
}

class Assign3_9{
	public static void main(String[]args){
		Animal d1=new Dog();
		Animal c1=new Cat();
		
		d1.makeSound();
		c1.makeSound();
	}
}