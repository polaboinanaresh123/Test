package project2;

public class PolyDemo1
{
	void funA()
	{
	
	System.out.println("zero args of funA of polydemo1");
	}
	void funA(int a)
	{
	System.out.println("int args of funA of polydemo1");
	System.out.println(a);
	}
	void funA(long a)
	{
		System.out.println("long args of funA of polydemo1");
		System.out.println(a);
		
		
	}
	void funA(float a)
	{
		System.out.println("float args of funA of polydemo1");
		System.out.println(a);
		
	}
	
	void funA(double a)
	{
		System.out.println("double args of funA of polydemo1");
		System.out.println(a);
		
	}

	public static void main(String[] args)
	{
		PolyDemo1 d=new PolyDemo1();
		d.funA();
		d.funA(4);
		d.funA(23.89f);
		d.funA(23.89);

		
	

	}

}
