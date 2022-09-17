package arrayprograms;
import java.util.Scanner;
public class reversearray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many elements:");
		int n=sc.nextInt();
		int elt[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter element"+(i+1));
			elt[i]=sc.nextInt();
			
		}
		System.out.println("original element are");
		for(int i=0;i<n;i++)
		{
			System.out.print(elt[i]+" ");
		}
		System.out.println("reverse array");
		for(int i=n-1;i>=0;i--)           
		{
			System.out.print(elt[i]+" ");
		}
	}

}
