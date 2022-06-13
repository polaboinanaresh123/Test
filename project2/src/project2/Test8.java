package project2;

public class Test8
{

	public static void main(String[] args)
	{
		

	}
	public class A
	{
		int i=10;
	}
	A[] TestFunction()
	{
		A []rbg={new A(),new A(),new A()};//non-primitive variable takes address only
		//A []rbg1={12,23,45};
		return rbg;
	}

}
