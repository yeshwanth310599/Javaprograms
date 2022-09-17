import java.util.Scanner;

public class sumofano {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0;
		int rem;
		while(num>0)
		{
			rem=num%10;       //r=437%10=7    //r=43%10=3  //r=4%10=4
			sum=sum+rem;      //s=0+7=7       //s=7+3=10   //s=10+4=14   <-----
			num=num/10;       //n=437/10=43   //43/10=4    //4/10=0
			
		}
		System.out.println(sum);

	}

}
