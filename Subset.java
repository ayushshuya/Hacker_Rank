package star;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Subset {

	public static void main(String[] args) {
		
		long a1[]= {11, 1, 13, 21, 3, 7};
		long a2[]= {11 ,3 ,7, 1,1};
		
		Set<Integer> hs = new HashSet<Integer>();
		Set<Integer> hs1 = new HashSet<Integer>();
		ArrayList<Long> arrl=new ArrayList<Long>();
		ArrayList<Long> arrl1=new ArrayList<Long>();
	

for(int i=0;i<a1.length;i++) {
            arrl.add(a1[i]);}
System.out.println(arrl);
for(int j=0;j<a2.length;j++) {
            arrl1.add(a2[j]);}

System.out.println(arrl1);
      if(arrl.containsAll(arrl1)){
      System.out.println("present");}
      else 
      {
    	  System.out.println("not present");
      }
        
      
	}

}
