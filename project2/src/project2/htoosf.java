package project2;

public class htoosf 
{
	int funC(int z)
	{
	for(z=100;z<176;z++)
	if(z%2==0)
	//System.out.println(z);
	return z;
	}
	void funA()
	{
		for(int j=100;j<176;j++)
		if(j%2==0)
		{
			System.out.println(j);
		}
	}
	void funB()
	{
		for(int k=100;k<176;k++)
			if(k!=0)
			{
				System.out.println(k);
			}
				
	}

	public static void main(String[] args) 
	{
		htoosf h=new htoosf();
		h.funC(13);
		//h.funB();
		
		

	}

}
