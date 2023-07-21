package star;

import java.util.Scanner;

public class Stringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char reverse;
        String b="";
        for(int i=0;i<A.length();i++)
        {
            reverse=A.charAt(i);
            b=reverse+b;
            
        }
//        if(b.compareTo(A)==0)
//        {
//           System.out.println("Yes");
//        }
//        else{
//        System.out.println("No");
//        }
        System.out.println(b);
        
        for(int i=A.length()-1;i>=0;i--) {
        	b=b+A.charAt(i);
        }
        System.out.println(b);

	}
}

