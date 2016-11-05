package example;

public class Sample1 {
	
	//function with no argument,with return type //
	
	int Sum()
	{
		int a=1,b=2;
		int c=a+b;
		
		return c;
	}
	
	public static void main(String args[])
	{
		Sample1 obj=new Sample1();
		int r=obj.Sum();
		
		System.out.println("Addition value:"+r);
	}
	
	

}
