package project2;

public class OddNumbers
{
	void fun()
	{
		//for(int i=1;i<101;i++)
			for(int i=1;i<=101;i++)	
			if(i%2!=0)
			{
				System.out.println(i);
			}
	}

	public static void main(String[] args)
	{
		OddNumbers e= new OddNumbers();
		e.fun();
	}

}
