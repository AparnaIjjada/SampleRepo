package Java8;
@FunctionalInterface

interface Square {
	int calculate(int x);
}

class FunctionalInterfaceex {
	public static void main(String args[])
	{
		int a = 5;

		// lambda expression to define the calculate method
		Square s = (int x) -> x * x;
		
		int ans = s.calculate(a);
		System.out.println(ans);
	}
}