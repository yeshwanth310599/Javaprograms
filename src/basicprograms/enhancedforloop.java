package basicprograms;

public class enhancedforloop {
	public static void main(String args[])
	{
		int i;
		String name[]= {"yeshwanth","vishal","gokul"};
		for(i=0;i<name.length;i++) {
			System.out.println("for:"+name[i]);
		}
		System.out.println("-----------------------");
		for(String a:name)
		{
			System.out.println("for:"+a);
		}
		System.out.println("-----------------------");
		for(i=0;i<=2;i++)
		{
			System.out.println(i +" "+ name[i]);
		}
		for(i=0;i<name.length;i++)
		{
			System.out.println(i +" "+ name[i]);
		}
	}

}
