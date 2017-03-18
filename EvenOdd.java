import java.lang.*;		//imported by default
import java.util.Scanner;

class EvenOdd
{
	public static void main(String args[])
	{
		int x;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a Number : ");
		x = s.nextInt();

		if(x%2 == 0)
		{					//Compound Statement
			System.out.println(x+" is Even");
		}
		else
		{
			System.out.println(x+" is Odd");
		}
	}
}
 

