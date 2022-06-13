package project2;

public class PrintWithoutLoop 
{
	int fun(int a)
	{
		if(a<=10)
		
		System.out.println(a);
		fun(a+1);
		
		
		
		//return a+1;
		
		
		return a+1 ;
		}
	//fun(a+1);
	

	public static void main(String[] args) 
	{
		PrintWithoutLoop p=new PrintWithoutLoop();
		//p.fun(1);
		int b=p.fun(1);
		System.out.println(b);
		
		

	}

}
