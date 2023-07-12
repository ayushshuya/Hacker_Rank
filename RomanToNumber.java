package star;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {
	
	
	

	public static void main(String[] args) {
		
		
		String str="X";
		// TODO Auto-generated method stub

		Map<Character,Integer> map=new HashMap<Character,Integer>();
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		str=str.replace("IV","IIII");
		str=str.replace("IX","VIIII");
		 int number=0;
		 
		 for(int i=0;i<str.length();i++) {
			 number=number+map.get(str.charAt(i));
		 }
		 System.out.println(number);
		
	}

}
