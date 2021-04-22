import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] mat1 = new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		int row1=sc.nextInt();
		int col1=sc.nextInt();
		int[][] mat2 = new int[row][col];
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				mat2[i][j]=sc.nextInt();
			}
		}
		int [][] result=new int [row][col];
		if(row==row1 && col==col1)
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					result[i][j]=mat1[i][j]+mat2[i][j];
				}
			}
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(result[i][j]);
					if(j<col-1)
					{
					System.out.print(" ");
					}
					
				}
				System.out.println();
			}
		}
		
		
	}
	

}
