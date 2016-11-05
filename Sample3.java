package example;

public class Sample3 {
	
	//with return type,with argument//
	
	int Sum(int a,int b)
	{
		int c=a+b;
		return c;
		
	}
	
	public static void main(String args[])
	{
		Sample3 obj=new Sample3();
		int r=obj.Sum(100, 200)+obj.Sum(10, 20);
		System.out.println("Addition value:"+r);
	}

}
