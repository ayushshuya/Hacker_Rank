package star;

import java.util.HashMap;
import java.util.Map;

public class EncryptString {

	public static void main(String[] args) {
		
		String S = "bb";
		String s1="";
		
		int a=S.length();
		// TODO Auto-generated method stub
		
		System.out.println(a);
		Map<Integer,String> map=new HashMap<>();
		map.put(10, "a");
		map.put(11, "b");
		map.put(12, "c");
		map.put(13, "d");
		map.put(14, "e");
		map.put(15, "f");
		String str=String.valueOf(S.charAt(0));
		String str1=str.concat(map.get(a));
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			s1=ch+s1;
			
		}
		
		System.out.println(s1);
		

	}

}
