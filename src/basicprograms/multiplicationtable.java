package basicprograms;
import java.util.Scanner;
public class multiplicationtable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a positive no:");
		int num=sc.nextInt();
		System.out.println("Multiplication table....");
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+(num*i));
		}
		

	}

}
