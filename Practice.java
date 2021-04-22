import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<String> check = new ArrayList<>();
		List<String> result = new ArrayList<>();

		int n=sc.nextInt();

		for(int i=0;i<n;i++)
		{
			String x=sc.next();
			check.add(x);
		}
//		int m=sc.nextInt();
//
//		for(int i=0;i<n;i++)
//		{
//			String x=sc.next();
//			result.add(x);
//		}
		Collections.sort(check);
		System.out.println(check);
//		System.out.println(result);
//		int x=solve(check,result);
//		System.out.println(x);

	}
	
	public static int solve(List<String> check,List<String> result)
	{
		int c=check.size();
		int r=result.size();
		int score=0;
		
		for(int i=0;i<c&&i<r;i++)
		{
			if((check.get(i).equals(result.get(i)))&&(result.get(i)!=" "))
			{
				score=score+4;
			}
			else if (result.get(i).equals(" "))
			{
				score=score+0;
				
			}else
			{
				score=score-1;
			}
		}
		return score;
	}

}
