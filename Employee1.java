package sampleconst;

public class Employee1 {
	
	int empno;
	String empname;
	double empsal;
public Employee1(int temp_empno,String temp_empname,double temp_empsal)
{
	empno=temp_empno;
	empname=temp_empname;
	empsal=temp_empsal;
	
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
	Employee1 e1=new Employee1(100,"sam",120.2);
	e1.DisplayDetails();
}
}
