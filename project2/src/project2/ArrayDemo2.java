package project2;

public class ArrayDemo2
		{

		public static void main(String[] args)
		{
		int arr1[]=new int[5];
		arr1[0]=10;
		arr1[3]=20;
		arr1[1]=30;
		arr1[4]=40;
		arr1[0]=890;
		arr1[1]=110;
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[3]);
		//System.out.println(arr1[5]);
		long arr2[]=new long[5];
		//long arr1[]={12,34,76,39,78,23,86};
		arr2[0]=2;
		arr2[2]=9;
		arr2[1]=3;		
		arr2[4]=7;
		System.out.println(arr2[0]);
		System.out.println(arr2[3]);
		System.out.println(arr2[1]);
		System.out.println(arr2[4]);
		float arr3[]=new float[5];
		//float arr1[]={12,34,76,39,78,23,86};
		arr3[0]=2.4f ;
		arr3[2]=9.7f;
		arr3[1]=3.2f;		
		arr3[4]=7.2f;
		System.out.println(arr3[0]);
		System.out.println(arr3[3]);
		System.out.println(arr3[1]);
		System.out.println(arr3[4]);
		double arr4[]=new double[5];
		//float arr1[]={12,34,76,39,78,23,86};
		arr4[0]=2.4f;
		arr4[2]=9.7f;
		arr4[1]=3.2f;		
		arr4[4]=7.2f;
		//arr4[0]=2.4;
		//arr4[2]=9.7;
		//arr4[1]=3.2;		
		//arr4[4]=7.2;
		System.out.println(arr4[0]);
		System.out.println(arr4[3]);
		System.out.println(arr4[1]);
		System.out.println(arr4[4]);
		char arr5[]=new char[5];
		//long arr1[]={12,34,76,39,78,23,86};
		arr5[0]=5;
		arr5[2]=9;
		arr5[1]=3;		
		arr5[4]=7;
		arr5[0]='v';
		//arr5[2]='b';
		//arr5[1]='y';		
		//arr5[4]='e';
		System.out.println(arr5[0]);
		System.out.println(arr5[3]);
		System.out.println(arr5[1]);
		System.out.println(arr5[4]);
		boolean arr6[]=new boolean[5];
		arr6[0]=true;
		arr6[3]=false;
		arr6[1]=false;
		arr6[4]=true;
		arr6[0]=false;
		
		
		System.out.println(arr6[0]);
		System.out.println(arr6[1]);
		System.out.println(arr6[3]);
		System.out.println(arr6[5]);
	}

}
