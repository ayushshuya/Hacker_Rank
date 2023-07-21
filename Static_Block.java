package star;

import java.util.Scanner;

public class Static_Block {
	static int b;
	static int h;
	static boolean flag=true;
    static {
    	
	Scanner sc=new Scanner(System.in);
	 b=sc.nextInt();
	 h=sc.nextInt();
	
	
	try{
		if(b<=0||h<=0)
	
	{
		flag=false;
		throw new Exception("Breadth and height must be positive");
	}
	}
		catch(Exception e){
			System.out.println(e);
		}
			
		
		}
	



	public static void main(String[] args) throws java.lang.Exception {
		
		if(flag){
			int area=b*h;
			System.out.print(area);
			
		}

		
		

	}
}
