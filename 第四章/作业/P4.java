//本题借鉴网上的答案进行编写的
public class P4
{
	public static void main(String[] args)
	{
		String str = "中国abc";
		substring(str,2,4);
	}
	public static String substring(String str,int start, int end)
	{
		String result = "";
		if(str == null){
			System.out.println("No string input");
		}
		else {
			//源字符长度
			//（关键点）将String转换成为byte字节数组
			byte[] bt = str.getBytes();
			System.out.println("字符串转成字节数组的长度是："+bt.length);

			//直接构造一个新的string
			result = new String(bt , start, end);
			System.out.println("截出来的是"+result);
		}
		return result;
	}
}