package project2;

public class ArrayDemo5 
{
	void funA(int arr[])
	{
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	//System.out.println(k[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
	int i=2;
	System.out.println(arr[i]);
	
	}
	

	public static void main(String[] args) 
	{
		ArrayDemo5 a=new ArrayDemo5();
		//int[] k={23,53,75,34,98};
		int k[]=new int[5];
		k[0]=23;
		k[0]=93;
		k[1]=95;
		k[2]=38;
		k[3]=282;
		//k[4]=00;
		//k[4]=0;
		k[4]=000;
		k[0]=74;
		a.funA(k);
		
		

	}

}
