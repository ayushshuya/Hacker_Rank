package star;

public class StringToken {

	public static void main(String[] args) {
      
		String s= " He is a very very good boy, isn't he? ";
	      String st=s.trim();
	      String [] str=st.split("[! ,?._'@,]+");
	      if(st.isEmpty()) {
	    	  System.out.println(0);
	      }
	      else {
	      System.out.println(str.length);
	      for(int i=0;i<str.length;i++) {
	    	  
	    	  System.out.println(str[i]);
	    	  
	      }
	      }
	}

}
