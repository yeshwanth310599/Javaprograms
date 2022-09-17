package arrayprograms;
import java.util.Scanner;
public class linearsearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("enter" +n+ "values:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter target value:");
		int target=sc.nextInt();
		int position=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				position=i;
				break;
			}
		}
		if(position!=-1)
			System.out.println(target+ "found at position "+(position+1));
		else
			System.out.println("not found");

	}

}
