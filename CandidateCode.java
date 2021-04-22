/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here

    	String strNew="";
    	Scanner sc = new Scanner(System.in);
//    	System.out.println("enter a sentence");
    	String str=sc.nextLine();
//    	String[] arr = str.split(" ");
//    	
//    	for(int i=0;i<arr.length;i++)
//    	{
//    		//strNew+=arr[i];
//    		System.out.print(arr[i]+" ");
//    	}
//    	System.out.println("new:");
//    	System.out.println(strNew);
    	strNew=str.replaceAll("\\s+"," ");
    	strNew=strNew.trim();
    	System.out.println(strNew);
    }
}
