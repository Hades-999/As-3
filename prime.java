import java.util.*;
class prime
{
	public static void main(String args[])
	{
		int n,j,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		c=0;
		for(j=1;j<=n;j++)
		{
				if(n%j==0)
					c++;
		}
		if(c==2)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
	}
}