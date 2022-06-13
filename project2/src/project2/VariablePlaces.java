package project2;

public class VariablePlaces
{
int a=10;
static int b=20;
void funA(int a)
{
System.out.println("funA of variablesplaces");
int ab=10;
}
int funB(int b)
{
System.out.println("funB of variableplaces");
return 44;
}
public static void main(String[] args) 
{
VariablePlaces v=new VariablePlaces();
//v.funB(c);
v.funB(b);
//v.funA();
}
}
