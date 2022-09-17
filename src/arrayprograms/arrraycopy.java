package arrayprograms;

public class arrraycopy {

	public static void main(String[] args) {
		int original[]= {1,2,3,4,5,6};
		//int copy[] =original;
		int copy[]=new int[original.length]; 
		
	//method 1
		/*original[3]=20;
		System.out.println("original array");
		for(int i=0;i<original.length;i++)
		{
			
			System.out.print(original[i]+"\t");
			
		}
		System.out.println("copy array");
		for(int i=0;i<copy.length;i++)
		{
			
			System.out.print(copy[i]+"\t");
			
		}*/
		
	//method 2
		/*System.arraycopy(original,0,copy,0,original.length);
		original[3]=20; // this value is not reflected to original array
		System.out.println("original array");
		for(int i=0;i<original.length;i++)
		{
			
			System.out.print(original[i]+"\t");
			
		}
		System.out.println("copy array");
		for(int i=0;i<copy.length;i++)
		{
			
			System.out.print(copy[i]+"\t");
			
		}*/
		
	// method 3
		
		for(int i=0;i<original.length;i++)
			copy[i]=original[i];
		original[3]=20;
		for(int i=0;i<original.length;i++)
		{
			
			System.out.print(original[i]+"");
			
		}
		System.out.println("copy array");
		for(int i=0;i<copy.length;i++)
		{
			
			System.out.print(copy[i]+"");
			
		}
		

	}

}
