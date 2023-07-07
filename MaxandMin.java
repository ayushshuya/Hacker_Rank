package star;

public class MaxandMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {1,2,35,6,7};
		int max=0;
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(max);
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(min);
		
		
		

	}

}
