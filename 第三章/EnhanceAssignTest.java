public class EnhanceAssignTest
{
	public static void main(String[] args)
	{
		byte a = 1;
		//a = a+5;//这是错误的，因为5是int型，不能赋值给byte
		//但是可以进行这样，java会进行进制的转换
		a += 5;
		// if( a instanceof Byte){
		// 	System.out.println("ok");
		// }
	}
}