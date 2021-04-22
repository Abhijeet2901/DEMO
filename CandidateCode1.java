import java.io.*;
import java.util.*;
public class CandidateCode1 {
	public static void main(String args[] ) throws Exception {

		//Write code here
		int x,y=0;
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter length");
		int n=sc.nextInt();
		int[] total = new int[n*2];

		//System.out.println("enter range");
		for(int i=0;i<n*2;i++)
		{
			total[i]=sc.nextInt();
		}
	

		for(int i=0;i<total.length;i=i+2)
		{
			x=total[i];
			y=total[i+1];
			List<Integer> arr = rangeCheck(x, y);
			//System.out.println(arr);
			//System.out.println("difference between lowest and hisghest prime no is:");
			if(arr.size()>0)
			{
				int a=arr.get(0);
				int b=arr.get(arr.size()-1);
				if(b>a) 
				{
					System.out.println(b-a);
				}
				else if(a==b)
				{
					System.out.println("0");
				}

			}
			else
			{
				System.out.println("-1");


			}
		}

	}


	public static List<Integer> rangeCheck(int x,int y)
	{
		List<Integer> result = new ArrayList<>();
		for(int i=x;i<=y;i++)
		{
			boolean a=checkPrime(i);
			if(a==true)
			{
				result.add(i);
			}else
			{
				continue;
			}
		}
		return result;
	}
	public static boolean checkPrime(int x)
	{
		int r=0;
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
			{
				r++;
			}
		}
		if(r==2)
			return true;
		else
			return false;
	}
	
}
