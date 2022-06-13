package project2;

public class StringDemo1
{

	public static void main(String[] args)
	{
		String s=new String("this is selenium class");
		System.out.println(s);
		char c[]=s.toCharArray();
		//for(int i=0;i<=c.length;i++)
		//for(int i=0;i<=c.length-1;i++)
		for(int i=0;i<=4;i++)
		//System.out.println(c[i]);
		System.out.print(c[i]);
		//for(int i=6;i<=c.length-1;i++)
		for(int l=6;l>=4;l--)
		System.out.print(c[l]);
		for(int j=8;j<=16;j++)
		System.out.print(c[j]);
		for(int k=21;k>=17;k--)
		System.out.print(c[k]);
			
		
		

	}

}
