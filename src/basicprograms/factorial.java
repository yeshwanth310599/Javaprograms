package basicprograms;

import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:"); 
		int n=sc.nextInt();  //5
		int f=1;
		while(n>0)   
		{
			f=f*n;
			n--;
			
		}
		System.out.println("factorial="+f);
			


	}

}
