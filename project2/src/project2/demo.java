package project2;


		public class demo
		{
			int add(int a,int b)
			{

				System.out.println("sum"+(a+b));
				return (a+b);
			}
			int funA(int i)
			{
			for(int j=100;j<176;j++)
		if(j%2==0)
			return j;
			System.out.println();
			return i;
				
		}
			public static void main(String[] args)
			{
				demo r=new demo();
				r.display();
				r.add(34,56);
				r.add(65,45);
				r.add(23,78);
				r.add(34,65);
				System.out.println(r.add(37,50));
				r.add(87, 57);
				r.funA(19);
				
			}
			void display()
			{
				System.out.println("naresh");
			}

		

	}


