package basicprograms;


public class methodoverloading {
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	

}
class over{
	public static void main(String args[])
	{
		//System.out.println(methodoverloading.add(10, 10));
		//System.out.println(methodoverloading.add(10, 10,10));
		methodoverloading obj =new methodoverloading();
		
	}
}
