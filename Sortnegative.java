package star;

public class Sortnegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,-2,-3,7,5};
		int temp;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i+1;j<arr.length;j++){
            
            if(arr[i]<0)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
            }
            
        }
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);}
        System.out.println("===========");
        

	}

}
