
public class patternprinting {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)//outer loop
		{
			for(int j=1;j<=i;j++) //inner loop
				System.out.print("* ");
			System.out.println();
		}
		System.out.println("--------------------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) 
				System.out.print(j+" ");
			System.out.println();
		}
		System.out.println("--------------------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--) 
				System.out.print("* ");
			System.out.println();
		}
		System.out.println("--------------------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--) 
				System.out.print(j+" ");
			System.out.println();
		}
		System.out.println("--------------------------");
		for(int i=1;i<=5;i++)//outer loop
		{
			for(int j=1;j<=i;j++) //inner loop
				System.out.print("* ");
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--) 
				System.out.print("* ");
			System.out.println();
		}
		System.out.println("--------------------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--) 
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("--------------------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--) 
				System.out.print("*  ");
			for(int k=1;k<=i;k++)
				System.out.print("");
			System.out.println();
		}
		System.out.println("--------------------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) 
				System.out.print(i+" ");
			System.out.println();
		}
		System.out.println("--------------------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) 
				System.out.print(j+" ");
			System.out.println();
		}
		System.out.println("--------------------------");
		int count=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;i++)
				System.out.print(i+" ");
			System.out.println();
		}
		
	}

}
