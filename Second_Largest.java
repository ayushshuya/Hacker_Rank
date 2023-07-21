package star;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Second_Largest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		List<Integer> Larr=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
		Larr.add(new Integer(arr[i]));
		}
		System.out.println(Larr);
		Collections.sort(Larr);
		
		
		System.out.println(Larr);
		
		
			System.out.println(Larr.get(n-2));

		
		

	}

}
