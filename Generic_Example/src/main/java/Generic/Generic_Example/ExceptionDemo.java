package Generic.Generic_Example;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

		static void fun() throws NullPointerException
		{ 
				new NullPointerException("demo"); 				
		} 

		public static void main(String args[])
		{ 
			//System.out.println("Ronak");
			try {
				fun();
				FileReader f = new FileReader("c://txt.t");
				//System.out.println(10/0);
			}
			catch(IOException e) {	
				System.out.println("File Exception ouccer");
			}
			catch(NullPointerException n) {
				
				System.out.println("Exception ouccer");
			}
			System.out.println("Ronak");
		} 

}
