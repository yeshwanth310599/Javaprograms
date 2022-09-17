import java.util.Scanner;

public class evenoddcountarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int even=0;
		int odd=0;
		System.out.println("enter" +n+ "values:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0) {
				System.out.println(arr[i]+"is even");
				even++;
			}
			
			else
			{
				System.out.println(arr[i]+"is odd");
				odd++;
			}
			
		}
		System.out.println("even counts are:"+even+ "\nodd counts are:"+odd);
			
		

	}

}
