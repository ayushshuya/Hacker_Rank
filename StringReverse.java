package star;

public class StringReverse {
	
	String reverseWords(String S)
    {
        
        String a="";
        String b=".";
        String[] arr = S.split("[.]");  
        for(int i=arr.length-1;i>=0;i--)
        {
        	 a=a+arr[i];
        	 a=a.concat(b);
        	
        }
         a=a.substring(0,a.length()-1);
        return a;
        
    }

	public static void main(String[] args) {
		
		StringReverse s1=new StringReverse();
		//s1.reverseWords("i.like.this.program.very.much");
		System.out.println(s1.reverseWords("i.like.this.program.very.much"));

//		String str="i.like.this.program.very.much";
//		
//		String[] rev=str.split("[.]",0);
//		System.out.println(rev);
//		System.out.println(str);
//		
//		for(int i=0;i<rev.length-1;i++) {
//			
//			
//			System.out.println(rev[i]+".");
//		}
//		
//		for(String a:rev) {
//			System.out.println(a);
//		}
		//String a="";
		//String str = "i.like.this.program.very.much";  
//        System.out.println("Returning words:");  
      //  String[] arr = str.split("[.]");  
//        System.out.println(arr);
//        for (String w : arr) {  
//            System.out.println(w);  
//        }  
//        for(int i=arr.length-1;i>=0;i--)
//        {
////        	System.out.print(arr[i]+".");
//        	 a=a+arr[i];
//        }
//        return a;
//        System.out.println("Split array length: "+arr.length);  
    } 
	}

