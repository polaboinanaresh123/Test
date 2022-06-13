package project2;

public class StringBuffer2
{
	 public static String concatWithString()    {  
	        String t = "Java";  
	        for (int i=0; i<10000; i++){  
	            t = t + "Tpoint";  
	        }  
	        return t;  
	 }
	public static void main(String[] args) 
	{
		StringBuffer2 s=new StringBuffer2();
		s.concatWithString();
	

	}

}
