package project2;

public class Ramesh {

	public static void main(String[] args)
	{
		Ramesh r=new Ramesh();
		r.AddNumber();
		r.AddNumbers2(23,53);
		r.AddNumbers3(42,41,85);
		System.out.println(r.AddNumbers3(2,5,8));
		}
	void AddNumber()
	{
		int a=10; 
		int b=20;
		System.out.println(a+b);
		int c;
		c=a+b;
		System.out.println(c);
		
	}
	void AddNumbers2(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
		System.out.println(a+b);
	
	}
	int AddNumbers3(int a,int b,int c)
	{
		int d;
		d=a+b+c;
		System.out.println(d);
		return d;
	}

}
