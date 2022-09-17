import java.util.Scanner;
public class positivenegativeno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a  no:");
		int num=sc.nextInt();
		if(num>0)
			System.out.println(num+"it is a positive no");
		else
			System.out.println(num+"it is negative no");
			

	}

}
