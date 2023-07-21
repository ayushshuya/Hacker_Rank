package star;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> hs = new HashSet<Integer>();
		int[]arr= {1,2,-2,4,5};
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				hs.add(sum);
				
				}
			System.out.println(hs);
			System.out.println(sum);
			if(sum==0||hs.contains(0)) {
				System.out.println("summation zero found at "+ +arr[i]);
				break;
			}
		}

	}

}
