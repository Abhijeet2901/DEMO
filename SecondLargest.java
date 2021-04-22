import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondLargest {

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
		Collections.sort(arr);
		System.out.println(arr.get(arr.size()-2));

	}

}
