package star;

import java.util.ArrayList;
import java.util.Collections;

public class DupsInArray {

	public static void main(String[] args) {
		ArrayList <Integer> arrl=new ArrayList<>();

		int arr[] = {2,1,1,2,3};
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) 
				{
					arrl.add(arr[i]);
				}
				
				}
	
			
			
		}
		Collections.sort(arrl);
		System.out.println(arrl);
	}

}
