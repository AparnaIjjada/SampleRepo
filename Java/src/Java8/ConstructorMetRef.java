package Java8;
@FunctionalInterface
interface  I{
	public void M1();
}
class Test{
	Test(){
		System.out.println("method reference to constructor");
		
	}
}

public class ConstructorMetRef {
	public static void  main(String[] args) {
		I obj = Test::new;
		obj.M1();
		
	}

}
