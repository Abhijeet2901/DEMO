import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		List<Integer> arr = new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			arr.add(x);
			
		}
		for(int i=0;i<arr.size();i++)
		{
			int x=arr.get(i);
			boolean res = isMultiple(x);
			if(res==true)
			{
				System.out.println("YES");
			}else
			{
				System.out.println("NO");
			}
		}
		
		

	}
	public static boolean isMultiple(int x)
	{
		if(x%3==0)
			return true;
		else
			return false;
		
	}
	

}
