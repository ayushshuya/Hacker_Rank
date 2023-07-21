package star;

public class Panagram {

	public static void main(String[] args) {
		
		String str = "Abcdefghijklmnopqrstuvwxyz12";
		 
		 str=str.toLowerCase();
	        
	        boolean isPresent=true;
	        
	        
	        for(char i='a';i<='z';i++){
	            
	            if(!str.contains(str.valueOf(i))){
	                isPresent=false;
	                break;
	                
	            }
	        }
	        if(isPresent) {
	        	System.out.println("panagram");
	        }
	        else {
	        System.out.println("not");
	        }

	}

}
