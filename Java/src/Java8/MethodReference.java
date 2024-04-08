package Java8;

@FunctionalInterface
interface Display {  
    void display();  
}  
public class MethodReference {  
    public void myMethod() {  
	System.out.println("method reference in java 8");  
    }  
    public static void main(String[] args) {  
    	MethodReference obj = new MethodReference();   
	// Reference to the method using the object of the class myMethod
	 Display ref = obj::myMethod;  
	// Calling the method inside the functional interface Display 
	ref.display();  
    }  
}
