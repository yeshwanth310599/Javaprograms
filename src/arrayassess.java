
public class arrayassess {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50}; 
        for(int i=0;i<arr.length;i++)
        {
                System.out.println(arr[i]);
        }
       
        System.out.println("element at first index: " +arr[1]);
        
        System.out.println("---------------------------------- ");
        
        int a[ ][ ] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        for(int i=0;i<3;i++)
        {
        	for (int j = 0; j < 5; j++) {
        		
        		System.out.print(a[i][j]+" ");
			}
        	System.out.println();
        }
	}
}

