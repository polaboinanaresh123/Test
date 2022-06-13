

package project2;

public class PolyDemo3
{

	public static void main(String[] args) 
	{
		PolyDemo3 p1=new PolyDemo3();
		A k=new A();
		p1.funA(k);
		System.out.println(new A());
		//p1.funA(null);
		B l=new B();   
		p1.funA(l);     //l object of class b
		p1.funA(new B());
		 C m=new C();
		 p1.funA(m);           //m object of class c
		 p1.funA(new C());
		

	}
	void funA(A a)
	{
		System.out.println("class A object");
		System.out.println(a);
	
	}
	void funA(B a)      //class b
	{
		System.out.println("class B object");
	System.out.println(a);
		
	}
	void funA(C a)     //class c
	{
		System.out.println("class C object");
	System.out.println(a);
		
	}
	

}
