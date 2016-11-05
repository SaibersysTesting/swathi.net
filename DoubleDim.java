package arrayex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleDim 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		// Declare double dimensional array
		int[][] a=new int[2][3]; 
		
		
		// store the values
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter Array values...");
		for(int r=0;r<2;r++)
		{
			
			System.out.println("Enter "+(r+1)+" row values ");
			for(int c=0;c<3;c++)
			{
				a[r][c]=Integer.parseInt(br.readLine());
			}
		}
		
			
		
		
		// display the values
		System.out.println("Given Array values...");
		for(int r=0;r<2;r++)
		{
			
			for(int c=0;c<3;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			
			System.out.println("");
		}
		
		
	}

}

