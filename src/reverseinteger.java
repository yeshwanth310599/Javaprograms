import java.util.Scanner;

public class reverseinteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();   
		int sum=0,rem;
		while(num!=0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
			
		}
		System.out.println(sum);
		
		
		

	}

}
