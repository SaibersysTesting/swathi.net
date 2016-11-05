package arrayex;
import java.io.*;

public class SingleDimen {
	
	public static void main(String args[]) throws NumberFormatException, IOException
	{
	
	int[] a=new int[5];
	
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	
	System.out.println("Enter five integer array elements:");
	
	for(int i=0;i<=5;i++)
	{
		a[i]=Integer.parseInt(br.readLine());
	}
	
	System.out.println(" give five integer array elements:");
	
	
	for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	

}

	}
