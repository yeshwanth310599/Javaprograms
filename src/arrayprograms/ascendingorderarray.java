package arrayprograms;

public class ascendingorderarray {

	public static void main(String[] args) {
		int a[]= {3,6,4,2,1,5};
		int temp,i,j;
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
			
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println();
		for(int k=0;k<a.length;k++)
			System.out.print(a[k]+" ");
	}

}
