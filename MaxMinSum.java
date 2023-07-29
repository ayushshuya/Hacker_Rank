package star;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMinSum {

	public static void main(String[] args) {
		int maxsum=0;
		int minsum=0;
		
         
          
          List<Integer> arr=new ArrayList<>();
          arr.add(9);
          arr.add(1);
          arr.add(3);
          arr.add(5);
          arr.add(7);
//          
//          arr.add(685903712);
//          arr.add(623789054);
//          arr.add(793810624);
//          arr.add(895642170 );
//          arr.add(468592370);
          System.out.println(arr);
          Collections.sort(arr);
          System.out.println(arr);
          
          
          
          for(int i=0;i<4;i++) {
        	  minsum=minsum+arr.get(i);
          }
          for(int i=arr.size()-1;i>arr.size()-5;i--) {
        	  maxsum=maxsum+arr.get(i);
          }
          System.out.println();
        	  System.out.println(minsum);
        System.out.println(maxsum);  
          
	}

}
