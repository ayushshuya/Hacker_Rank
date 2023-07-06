package star;

import java.util.Scanner;

public class MatchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter length of array");
		int a=sc.nextInt();
		
		int [] arr=new int [a];
		
		System.out.println("enter elements is array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		System.out.println("enter no");
		int no=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==no) {
				count ++;
			}
		}
		
		System.out.println(count);
		

	}

}
