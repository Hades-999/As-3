import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		int n,r,rev,x;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		x=n;
		rev=0;
		while(x>=1)
		{
			r=x%10;
			rev=rev*10+r;
			x=x/10;
		}
		System.out.Println("Reverse="+rev);
	}
}