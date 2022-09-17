package arrayprograms;
import java.util.Scanner;

public class storejavaevenodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int e=0,o=0;
		System.out.println("enter" +n+ "values:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0) {
				e=e+1;
			}
				
			else
			{
				o++;
			}
			

	}
		int even[]=new int[e];
		int odd[]=new int[o];
		int q=0;
		for(int l=0;l<n;l++)
		{
			if(arr[l]%2==0) {
				even[q]=arr[l];
				q=q+1;
			}
		}
		int v=0;
		for(int h=0;h<n;h++)
		{
			if(arr[h]%2==0) {
				even[v]=arr[h];
				v=v+1;
			}
		}
		System.out.println("even no are:");
		for(int p=0;p<e;p++)
		{
			System.out.println(even[p]+" ");
		}
		System.out.println("odd no are:");
		for(int y=0;y<o;y++)
		{
			System.out.println(odd[y]+" ");
		}

}
}
