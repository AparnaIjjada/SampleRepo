package Java8;

public interface DefaultInterface {
		// abstract method
		public void square(int a);

		// default method
		default void show()
		{
		System.out.println("Default Method Executed");
		}

}
