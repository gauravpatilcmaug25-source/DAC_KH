import java.util.Scanner;
class TemperatureSensor{
	private int temperature;
	
public double gettemp(){
	return temperature;
}
public void settemp(int temperature){
	if(temperature>0 && temperature<100){
		this.temperature=temperature;
		System.out.println("Temperature = " + temperature);
	}
	else{
		System.out.println(" Temperature out of range ");
	}
}
}
class Assign3_5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Temperature : ");
		int typetemp=sc.nextInt();
		
		TemperatureSensor t1=new TemperatureSensor();
		t1.settemp(typetemp);
	}
}