package firstPackage;

import java.util.Scanner;
import java.lang.*;

public class Option {
	public void option()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter option:\n 1: Sum\n 2: Subtract \n 3: Multiply \n 4: Divide");
		int value = scan.nextInt();
		
		switch(value)
		{
		case 1: 
			sum();
			break;
		case 2: 
			subtract();
			break;
		case 3: 
			multiply();
			break;
		case 4: 
			divide();
			break;
	
		}
	
	Scanner scan1= new Scanner(System.in);
	System.out.println("Enter 0 to continue. 1 to exit");
	
	int x = scan1.nextInt();
	
	if(x==0)
	{
		option();
	}
	if(x==1) {
	System.exit(1);
	}
	}

public void sum()
{
	Scanner scan2= new Scanner(System.in);
	System.out.println("Enter first number");
	int a = scan2.nextInt();
	Scanner scan3 = new Scanner(System.in);
	System.out.println("Enter second number");
	int b = scan3.nextInt();
	int add = a + b;
	System.out.println("Sum is: "+add);
}
public void subtract()
{
	Scanner scan4 = new Scanner(System.in);
	System.out.println("Enter first number");
	int x = scan4.nextInt();
	Scanner scan5 = new Scanner(System.in);
	System.out.println("Enter second number");
	int y = scan5.nextInt();
	int sub = x - y;
	System.out.println("Subtraction is: "+sub);
}
public void multiply()
{
	Scanner scan6 = new Scanner(System.in);
	System.out.println("Enter first number");
	int x = scan6.nextInt();
	Scanner scan7 = new Scanner(System.in);
	System.out.println("Enter second number");
	int y = scan7.nextInt();
	int mul = x * y;
	System.out.println("Multiplication is: "+mul);
}
public void divide()
{
	Scanner scan8 = new Scanner(System.in);
	System.out.println("Enter first number");
	int x = scan8.nextInt();
	Scanner scan9 = new Scanner(System.in);
	System.out.println("Enter second number");
	int y = scan9.nextInt();
	double div = (double)x / y;
	System.out.println("Division is: "+div);
}
}
