interface FuncInterface
{
	void Fun(int x,int y);

	default void normalFun()
	{
	System.out.println("Hello");
	}
}

class Java8Ex
{
	public static void main(String args[])
	{
		// lambda expression to implement above
		// functional interface. This interface
		// by default implements Fun()
		FuncInterface sum = (int x,int y)->System.out.println(x+y);
		FuncInterface mul = (int x,int y)->System.out.println(x*y);
		// This calls above lambda expression and prints 10.
		sum.Fun(5,10);
		mul.Fun(4, 7);
	}
}
