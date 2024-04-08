package Java8;

//A simple program to Test Interface default
//methods in java


class DefaultClass implements DefaultInterface
{
	// implementation of square abstract method
	public void square(int a)
	{
		System.out.println(a*a);
	}

	public static void main(String args[])
	{
		DefaultClass d = new DefaultClass();
		d.square(4);

		// default method executed
		d.show();
	}
}
