import java.util.Scanner;

/**
 * @author lenovo
 *
 */
public class HelloWorld{

     public static void main(String []args){
        
     Scanner sc = new Scanner(System.in);
     
    // System.out.println("enter name");
     String s=sc.next();
    // System.out.println("enter length");
     int n=sc.nextInt();
     String[] sample = new String[n];
    // System.out.println("enter subs");
     for(int i=0;i<n;i++)
     {
    	 sample[i]=sc.next();
    	 if(sample[i]=="")
    		 sample[i]=sc.next();
     }
     
     for(int j=0;j<sample.length;j++)
     {
    	 String z=sample[j];
    	 boolean out = checkSubsequence(s, z);
    	 if(out==true)
    	 {
    		 System.out.println("POSITIVE");
    	 }else
    	 {
    		 System.out.println("NEGATIVE");
    	 }
     }
     
  
}
     public static boolean checkSubsequence(String s,String sub)
     {
    	int m=sub.length();
    	int n=s.length();
    	 int j = 0;
    	 
         // Traverse s and sub, and compare
         // current character of sub with first
         // unmatched char of s, if matched
         // then move ahead in s
         for (int i = 0; i < n && j < m; i++)
             if (sub.charAt(j) == s.charAt(i))
                 j++;
  
         // If all characters of s were found
         // in sub
         return (j == m);
    	
     }
     
}