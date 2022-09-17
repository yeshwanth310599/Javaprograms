package arrayprograms;
import java.util.Scanner;

public class evenoddsuminarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0,sum1=0;
		System.out.println("enter" +n+ "values:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0) {
				sum=sum+arr[i];
				
				
			}
			
			else
			{
				sum1=sum1+arr[i];
			}
			
		}
		System.out.println("even sums are:"+sum+ "\nodd sums are:"+sum1);

	}

}
