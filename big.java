import java.util.*;
class big
{
	public static void main(String args[])
	{
		int a,b,c,l;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		l=(a>b)?((a>c)?a:c):(b>c)?b:c
		System.out.println("Largest no.="+l);
	}
}