package project2;

public class PolyDemo2
{
void funA(int i,int j)
{
	System.out.println("int int args of PolyDemo2");

}
static void funA(long i,long j)
{
	System.out.println("long long args of PolyDemo2");

}
void funB(int i,long j)
{
	System.out.println("int long args of PolyDemo2");

}
void funA(long i,int j)
{
	System.out.println("long int args of PolyDemo2");

}
	public static void main(String[] args)
	{
		PolyDemo2 d=new PolyDemo2();
		d.funA(10,34);
	

	}

}
