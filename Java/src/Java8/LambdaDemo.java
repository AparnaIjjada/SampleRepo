package Java8;

interface A{
	void display(String str);
}

public class LambdaDemo {
	public static void main(String[] args) {
		A obj;
		 obj = (str) -> 
		 {
			 System.out.println("Hello "+str);
		 };
		  obj.display("aparna");
	}
	 
	 

}
