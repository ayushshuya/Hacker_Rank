package star;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
         
		Scanner sc=new Scanner(System.in);
		int e=0;
		List<Integer> list=new ArrayList<>(); 
		System.out.println("Enter no of elements");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}

		
		System.out.println(list);
		
		System.out.println("enter no of q");
		int q=sc.nextInt();
		 for(int i=0;i<q;i++)
	        {
	        String operations=sc.next();
	        if(operations.equals("Insert"))
	         {
		System.out.println("enter position and element");
		int pos=sc.nextInt();
		int elem =sc.nextInt();
		
		list.add(pos, elem);
		System.out.println(list);
		
	         }
	        
	        else if(operations.equals("Delete"))
	        {
		System.out.println("enter index of element to be deleted");
		int in=sc.nextInt();
		list.remove(in);
	         }
	        }
		
		 
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		
	}

}
