package project2;

public class MethodDemo9
{

	public static void main(String[] args)
	{
		MethodDemo9 m=new MethodDemo9();
		m.funb();
		System.out.println(m.funb());
		int n=m.funb();
		System.out.println(n);
		

	}
	int funb()
	{
		System.out.println("funb of MethodDemo9");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return c;
	}

}
