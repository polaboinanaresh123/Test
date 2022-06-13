package project2;

public class ArrayDemo6
{
	int[] funA()
	{
		int k[]={10,20,30,40,50};
		return k;
	}

	public static void main(String[] args)
	{
		ArrayDemo6 a=new ArrayDemo6();
		int[] b=a.funA();
		//for(int i=0;i<5;i++)
		int i=2;
		//System.out.println(i);
		System.out.println(b[i]);	
	}
}
	   


