package star;

public class SubsetOfArray {

	public static void main(String[] args) {

		int a1[]= {11, 1, 13, 21, 3, 7};
		int a2[]= {11 ,3 ,7, 2};
		
		
		for(int i=0,t=0;i<a2.length && t!=1;i++) {
			for(int j=0;j<a1.length;j++) {
				
				if(a1[i]==a2[j]) {
				
				}
				else {
					t=1;
				
					break;
				}
				
			}
			System.out.println("not a subset");
		}
		
	}

}
