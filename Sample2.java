package example;

public class Sample2 {
	
	//function without return type,with arguments//
	
  void Sum(int a,int b)
 	{
	  int c=a+b;
	  
	  System.out.println("Addition value:"+c);
		
	}
  public static void main(String args[])
  {
	  Sample2 obj=new Sample2();
	  obj.Sum(10,20);
	  
  }

}
