import java.util.Scanner;

public class NumberOfUpperLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int u = 0,l=0;
		String x=sc.nextLine();
		for(int i=0;i<x.length();i++)
		{
			char a=x.charAt(i);
			if(Character.isUpperCase(a))
				u++;
			else if(Character.isLowerCase(a))
				l++;
			else
				continue;
		}
		System.out.println(u);
		System.out.println(l);

	}

}
