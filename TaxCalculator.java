package Thursday_Lab_10th_aug;

import java.util.Scanner;

public class TaxCalculator
{
	public static void main(String[] args)
	{
													// TODO Auto-generated method stub
	}
	Scanner sc = new Scanner(System.in);
	String empName;
	Boolean isIndian=true;
	double empsal;
	
	public void calculateTax()							//creating function calculateTax()	
	{
		System.out.println("Are you Indian T/F :");
		isIndian = sc.nextBoolean();					//adding boolean variables
		try
		{
			if(isIndian == false)
			{
				throw new Exception("The employee should be an Indian citizen for calculating tax");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Enter Employee Name :");
		empName = sc.next();
		try
		{
			if(empName == null)
			{
				throw new Exception("The employee name cannot be empty");	//throw an exception using throw keyword
			}
		}
		catch(Exception e)											//catch block to handle the exception										
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		System.out.println("Enter Your salary :");
		empsal = sc.nextInt();
		try															//using try block to add all value inside try block to execute the following code
		{
			if(empsal>100000)
			{
				double totAmount = empsal*8/100;
				System.out.println("Tax amount is :"+totAmount);
			}
			else if(empsal>50000 && empsal<100000)
			{
				double totAmount = empsal*6/100;
				System.out.println("Tax amount is :"+totAmount);
			}
			else if(empsal>30000 && empsal<50000)
			{
				double totAmount = empsal*5/100;
				System.out.println("Tax amount is :"+totAmount);
			}
			else if(empsal>10000 && empsal<30000)
			{
				double totAmount = empsal*4/100;
				System.out.println("Tax amount is :"+totAmount);
			}
			else
			{
				throw new Exception("The employee does not need to pay tax");   //throw an exception using throw keyword
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
}



