public class PrimitiveTransferTest
{
	public static void swap(int a,int b)
	{
		int temp = a;
		a = b;
		b = a;
	}
	public static void main(String[] args)
	{
		int a =6;
		int b =9;
		swap(a,b);
		System.out.println(a+""+b);
	}
}