package arrayprograms;
import java.util.Scanner;

public class arrayevenoddpostion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no a of element in array");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the element of"+(i+1));
			a[i]=sc.nextInt();
			
		}
		System.out.println("arrays are:");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0) {
				System.out.println(a[i]+" even is at position of"+(i+1));
				
			}
			else {
				System.out.println(a[i]+"odd is at position of "+(i+1));
		}
	}
	

	}
}
