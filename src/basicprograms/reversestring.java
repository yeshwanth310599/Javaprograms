package basicprograms;

public class reversestring {

	public static void main(String[] args) {
		String x="yeshwanth";
		char y[]=x.toCharArray(); // convert string a to array
		int size=y.length;
		char a[]=new char[size]; 
		int i=0;
		while(i!=size)
		{
			a[size-1-i]=y[i];
			i++;
		}
		System.out.println(y);
		System.out.println(a);

	}

}
