
public class palindromestring {

	public static void main(String[] args) {
		String x="mom";
		char y[]=x.toCharArray(); // convert string a to array
		int size=y.length;
		char a[]=new char[size]; 
		int i=0;
		while(i!=size)
		{
			a[size-1-i]=y[i];
			i++;
		}
		
	}

}
