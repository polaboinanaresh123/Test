package project2;



public class BudzDemo1 
{

	public static void main(String[] args)
	{
		int GrossSalary=1000;
		BudzDemo1 bd1=new BudzDemo1();
		int charges=bd1.HouseCharges2();
		int NetSalary=GrossSalary-charges;
		System.out.println(NetSalary);
		int TaxCal=30*charges;
	    System.out.println(TaxCal);
	    }
void HouseCharges()
{
	int rent=1000;
	int ChildFee=2000;
	int TotalCharges=rent+ChildFee;
	System.out.println(TotalCharges);
}
int HouseCharges2()
{
	int rent=1000;
	int ChildFee=2000;
	int TotalCharges=rent+ChildFee;
	System.out.println(TotalCharges);
	return TotalCharges;
}

}
