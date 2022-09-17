package arrayprograms;

import java.util.Scanner;

public class avgofarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no array element");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter a array elements");
		int sum=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("average="+sum/n);
		

	}

}
