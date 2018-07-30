public class EqualTest
{
	public static void main(String[] args)
	{
		String a = "hello";
		String b = "hello";
		String c = new String("hello");
		String d = new String("hello");
		System.out.println((a == b));
		a = a + "aaa";
		System.out.println((a == b));

		System.out.println(a);
		System.out.println(c);
	System.out.println((c == d));
	System.out.println((a == c));
	//System.out.println(a = b);
	}
}