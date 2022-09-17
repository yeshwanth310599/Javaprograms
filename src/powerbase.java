
public class powerbase {

	public static void main(String[] args) {
		int base=2;
		int power=3;
		int result=1;
		for(int i=1;i<=power;i++)  // 1 1<3  -> r=1*2=2 // 2 2<3 -> r=2*2=4 //3 3<=3 -> r=4*2=8  // 
			                       
		{
			result=result*base;
		}
		System.out.println(result);

	}

}
