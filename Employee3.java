package sampleconst;

public class Employee3 {
	int empno;
		String empname;
		double empsal;
		
		public Employee3()
		{
			empno=100;
			empname="swa";
			empsal=120.9;
		}
		
		
	public Employee3(int temp_empno,String temp_empname,double temp_empsal)
	{
		empno=temp_empno;
		empname=temp_empname;
		empsal=temp_empsal;
		
	}
	public Employee3(Employee3 e1)
	{
		empno=e1.empno;
		empname=e1.empname;
		empsal=e1.empsal;
	}
	
	void DisplayDetails()
	{
		System.out.println("employee details:");
		System.out.println("empname:"+empname);
		System.out.println("empno:"+empno);
		System.out.println("empsal:"+empsal);
		
	}

	public static void main(String args[])
	{
		Employee3 e1=new Employee3();
		Employee3 e2=new Employee3(100,"sam",120.2);
		Employee3 e3=new Employee3(e2);
		
		e1.DisplayDetails();
		e2.DisplayDetails();
		e3.DisplayDetails();
		
	}
}
