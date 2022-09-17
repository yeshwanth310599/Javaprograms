package basicprograms;

public class copyastring {

	public static void main(String[] args) {
		String x="yeshwanth";
		char y[]=x.toCharArray(); // convert string a to array
		int size=y.length;
		char a[]=new char[size]; // creating a new array for to copy y array
		int i=0;
		while(i!=size)
		{
			a[i]=y[i];
			i++;
		}
		System.out.println(y);
		System.out.println(a);
	}

}
