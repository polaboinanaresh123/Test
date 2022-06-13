package project2;


class ototwl
{

    void fun(int n)
    {
        if (n <= 10) 
        {
            System.out.println(n);
            fun(n + 1);
        }
    }

    public static void main(String[] args)
    {
    	ototwl o=new ototwl();
        o.fun(1);
    }
}
