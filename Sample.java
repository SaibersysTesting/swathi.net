package example;

public class Sample {
	
	void Sum()
	{
		
		//no argument,no return type
		int a=3,b=5;
		int c=a+b;
		 
		 System.out.println("Addition value:"+c);
		 
		

	}
	
	public static void main(String args[])
	{
		Sample obj=new Sample();
		obj.Sum();
	}
	

}
