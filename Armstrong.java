import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean result = checkArmstrong(n);
		if(result==true)
			System.out.println("True");
		else
			System.out.println("False");

	}
	private static boolean checkArmstrong(int x)
	{
		int r=checkNoOfDigit(x);
		int sum=0;
		int copy=x;
		int remainder=0;
		while(x>0)
		{
          remainder=x%10;
          sum=(int) (sum+Math.pow(remainder, r));
          x=x/10;
		}
		if(sum==copy)
		{
			return true;
		}
		else
			return false;
	}
	private static int checkNoOfDigit(int x)
	{
		int f=0;
		while(x>0)
		{
			f++;
			x=x/10;
		}
		return f;
	}

}
