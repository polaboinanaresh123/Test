package project2;

public class ConsDemo1 
{
	ConsDemo1()
	{
		System.out.println("cons of ConsDemo1");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method of ConsDemo1");
		ConsDemo1 c1=new ConsDemo1();
		System.out.println("done");
		new ConsDemo1();
		new ConsDemo1();
		new ConsDemo1();

	}

}
