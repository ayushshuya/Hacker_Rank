package star;

public class Pos_SubArr_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,7,5};
		int sum=0;
		int no=12;
		for(int j=0;j<arr.length;j++) 
		{
		for(int i=j;i<arr.length;i++) 
		{
			sum=sum+arr[i];
			int a=i+1;
			int b=j+1;
			
			if(sum==no) {
//				System.out.println("yes");
				System.out.println("start pos is :"+b);
				System.out.println("end pos is :"+ a);
				System.out.println("===========");
				
				
			}
			
			//System.out.println(sum);
			
			


		}
		

		
		
		
		sum=0;
		
		}
		

	}

}
