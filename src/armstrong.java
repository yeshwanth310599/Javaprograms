import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();   // getting the orginal no 
		int n=number;               // is to do operation below
		int sum=0,temp;
		while(n!=0)
		{
			temp=n%10;
			sum=sum+(temp*temp*temp);
			n=n/10;
		}
		if(sum==number)
			System.out.println("It is armstrong no");
		else
			System.out.println("it is no armstrong no");

	}

}
