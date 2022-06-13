package project2;

public class Test5
{
	static int r=1;
	Test5()
	{
		int r=4;
		System.out.println("text");
		r=r+1;
		System.out.println(r);
	}
	public static void main(String[] args) 
	{
		System.out.println(r);
		new Test5();
		new Test5();
		new Test5();
		System.out.println(r);
	}
		
	}


