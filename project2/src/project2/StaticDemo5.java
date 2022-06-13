package project2;



	public class StaticDemo5
	{ 
		int a=funA();
		static int b=funB();
		int funA()
		{
			System.out.println("funA of sd5");
		return 23;
		}
		static int funB()
		{
			System.out.println("funA of sd5");
		return 45;
		}

		public static void main(String[] args) 
		{
			System.out.println("main method start");
			StaticDemo5 s1=new StaticDemo5();
			s1.funA();
			System.out.println(s1.a);
			System.out.println("done");
			System.out.println(s1.funA());
			System.out.println(s1.funB());
			System.out.println(StaticDemo5.funB());
			new StaticDemo5();
			new StaticDemo5();
			//new StaticDemo5();
			// new StaticDemo5();

		}

	


	}


