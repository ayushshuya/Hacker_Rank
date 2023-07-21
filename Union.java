package star;

public class Union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {1, 2, 3, 4, 5};
				int arr2[]= {1, 2, 3};
				
				
				for (int i=0;i<1;i++) {
					for(int j=0;j<3;j++) {
					if(arr1[i]!=arr2[j]) {
						arr1[i]=arr2[j];
					}
				}
				}
				for (int i=0;i<arr1.length;i++) {
				System.out.println(arr1[i]);
				}

	}

}
