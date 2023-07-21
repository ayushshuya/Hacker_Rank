package star;

import java.math.BigInteger;
import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       BigInteger inp=sc.nextBigInteger();
	       int count=0;
	       for(int i=1;i<=inp;i++)
	       {
	           if(inp%i==0)
	           {
	               count++;
	           }
	       }
	       if(count>2)
	       {
	           System.out.println("not prime");
	       }
	       System.out.println("prime");
	}

}
