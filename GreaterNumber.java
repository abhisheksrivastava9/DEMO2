package Pack1;

import java.util.Scanner;

public class GreaterNumber 

{
	int a, b;
	
	void input()
	{
		Scanner s3 = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=s3.nextInt();
		b=s3.nextInt();
		s3.close();
		
	}
	
	void check()

	{
		if(a>b)
		{
			System.out.println("The greater number is "+ a);
		}
		
		else if (a==b)
		{
			System.out.println("Both are equal !");
		}
		
		else
		{
			System.out.println("The greater number is "+ b);
		}
	}


	public static void main(String[] args)
	
	{
		GreaterNumber gn = new GreaterNumber();
		gn.input();
		gn.check();

	}

}
