package star;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int arr[]= {1,2,3,5,4,7};
		System.out.println(arr.length);
		
		if(arr[0]>arr[1])
			System.out.println("1");
		
		if(arr[arr.length-1]>arr[arr.length-2])
			System.out.println("1");
		
		
		
		for(int i=1;i<arr.length-1;i++){
	           
	           if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
	        	   System.out.println("1");
	          
	        	   
		  }
		  

	}

}
