package star;

public class Max_Min_Elem_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,3,4,1,5};
		int temp;
		
		for(int i=0;i<arr.length;i++){
	           for(int j=i+1;j<arr.length;j++){
	        	   if(arr[i]<arr[j])
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
	        System.out.println(arr[0]+" "+arr[arr.length-1]);

	}
	
	//
	public class MinAndMax {
		   public int max(int [] array) {
		      int max = 0;
		     
		      for(int i=0; i<array.length; i++ ) {
		         if(array[i]>max) {
		            max = array[i];
		         }
		      }
		      return max;
		   }
		   public int min(int [] array) {
		      int min = array[0];
		     
		      for(int i=0; i<array.length; i++ ) {
		         if(array[i]<min) {
		            min = array[i];
		         }
		      }
		      return min;
		   }
		   public static void main(String args[]) {
		      int[] myArray = {23, 92, 56, 39, 93};
		      MinAndMax m = new MinAndMax();
		      System.out.println("Maximum value in the array is::"+m.max(myArray));
		      System.out.println("Minimum value in the array is::"+m.min(myArray));
		   }
		}

}
