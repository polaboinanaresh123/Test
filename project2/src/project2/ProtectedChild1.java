package project2;
import project1.ProtectedDemo1;
public class ProtectedChild1 extends ProtectedDemo1
{
public static void main(String[] args)
{
	ProtectedChild1 p1=new ProtectedChild1();
	System.out.println(p1.a);
	p1.funA();
	
}
}
