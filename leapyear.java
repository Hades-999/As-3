import java.util.*;
class leapyear
{
	public static void main(String args[])
	{
		int y;
		Scanner sc=new Scanner(System.in);
		y=sc.nextInt();
		if(y%4==0&&y%100!=0)
			System.out.println("Leap Year");
		else if(y%400==0)
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");
	}
}