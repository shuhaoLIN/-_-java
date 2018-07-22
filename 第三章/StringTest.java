public class StringTest
{
	public static void main(String[] args)
	{
		String str1 = "hello";
		String str2 = "hello";
		/**
		 * 下面返回true是因为java对于string类实现是
		 * 以常量池的形式进行的，所以其实str1和str2是指着同一个常量的引用
		 */
		System.out.println(str1 == str2);
		str1 = str1 + "ffff";
		System.out.println(str2);
	}
}