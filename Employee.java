package sampleconst;

public class Employee {
	int empno;
	String empname;
	double empsal;


public Employee()
{
	empno=100;
	empname="anil";
	empsal=120.2;

}
void DisplayDetails()
{
	System.out.println("empno:"+empno);
	System.out.println("empname:"+empname);
	System.out.println("empsal:"+empsal);
	
}
public static void main(String args[])
{
	Employee e=new Employee();
	e.DisplayDetails();
}
}
