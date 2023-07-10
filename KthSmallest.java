package star;

public class KthSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,2,0,2,1,0,2,0};
		int temp;
		
		int k=1;
		
		for(int i=0;i<arr.length;i++){
	           for(int j=i+1;j<arr.length;j++){
	        	   if(arr[i]>arr[j])
	        	   {
	            
	                temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	        	   }
	                
	            }
	        }
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		//System.out.println(arr[k-1]+" "+arr[arr.length-k]);
	}

}
