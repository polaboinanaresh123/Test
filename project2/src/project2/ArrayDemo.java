package project2;

public class ArrayDemo
{
	static int x,y;

	public static void main(String[] args) 
	{
		//char x=59;
		//char xy=34;
		//System.out.println(x);
		//System.out.println(xy);
		
		A k=new A();
		k.i=23;
		//System.out.println(k.i);
		A arr1[]=new A[5];
		arr1[0]=new A();
		arr1[2]=k;
		A arr2[][]=new A[2][3];
		arr2[0][2]=new A();
		arr2[0][1]=k;
		//System.out.println(arr2[0][2]);
		//System.out.println(arr2[0][1]);
		A arr3[][]=new A[2][3];
		arr3[1][2]=k;
		//System.out.println(arr3[1][2]);
		//System.out.println(k);
	    int x=5,y=5;
		int arr[][]=new int[x][y];
		arr[0][0]=40;
		//System.out.println(arr[2][0]);
		//x=0;y=1;
		//int arr[][]=new int[x][y];
		arr[0][1]=10;
		arr[0][2]=20;
		arr[0][3]=30;
		arr[1][0]=50;
		arr[1][1]=60;
		arr[1][2]=70;
		arr[1][3]=80;
		//arr[2][0]=90;
		//arr[2][1]=100;
		//arr[2][2]=110;
		//arr[2][3]=120;
		for(int i=0;i<arr.length;i++)
		//for(int i=0;i<5;i++)
		//for(int i=0;i<8;i++)
		//for(int j=0;j<arr.length;j++)
		for(int j=0;j<5;j++)
		//for(int j=0;j<7;j++)
		{
			//System.out.println(arr[i]);
			//System.out.println(arr[j]);
			System.out.println(arr[i][j]);
		}
		//int x1[][]={{12,23,45,34},{39,40,56,21},{74,60,39,64}};
		//for(int x=0;x<3;x++)
		//for(int y=0;y<4;y++)
		{
		//	System.out.println(x1[x]);
			//System.out.println(x1[y]);
		//	System.out.println(x1[x][y]);
		}
		//k.j=12;
		//System.out.println(k.j);
		//System.out.println(arr1[2].j);

	}

}
 