
package arrayex;


	
	public class ArrayFunctions 
	{
		
		public double[] Area()
		{
			// Find area of the circle
			double r=13.5;
			double ac=3.14*r*r;
			
			// Find the Area of the rectangle
			double l=16.5;
			double b=45.2;
			double ar=l*b;
			
			
			// store the results in array values 
			double[] results=new double[2];
			
			results[0]=ac;
			results[1]=ar;
			
			
			return results;
		}

		public static void main(String[] args) 
		{
			
			// class object
			ArrayFunctions obj=new ArrayFunctions();
			
			// call the function
			double[] r=obj.Area();
			
			// Display the results
			System.out.println("Area of the Circle : "+r[0]);
			System.out.println("Area of the Rectangle : "+r[1]);	
					

		}

	}



