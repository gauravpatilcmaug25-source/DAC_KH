import java.util.Scanner;
import java.io.*;

class Assign4_7{	
	public static void main(String[]args){
		try {
			File file=new File("Student.txt") ;
			FileReader fr=new FileReader(file);
		}catch( FileNotFoundException e){
			System.out.println(" Upload wrong file name: " );
		}
	}
}